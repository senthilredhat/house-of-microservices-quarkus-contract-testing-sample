package sample.house;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import sample.TrackerEntity;
import sample.resident.Resident;
import sample.rooms.Bathroom;
import sample.rooms.Bedroom;
import sample.rooms.Kitchen;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Path("/resident")
public class ResidentResource {
    private static final ExecutorService threadpool = Executors.newCachedThreadPool();

    // This is a non-cloud-safe way of handling session affinity.
    // For simplicity, it will do!
    private static final Map<String, Resident> residents = new HashMap<>();

    private Resident createResident(String sessionId) {
        final Resident abby = new Resident();
//        abby.getTorso().setState("bloated");
        residents.put(sessionId, abby);
        threadpool.submit(() -> wakeResident(abby));
        return abby;
    }

    private void wakeResident(Resident abby) {
        abby.setRoom("bedroom");
        pause();
        abby.setRoom("bathroom");
        abby = new Bathroom().visit(abby);
        pause();
        abby.setRoom("kitchen");
        abby = new Kitchen().visit(abby);
        pause();
        abby.setRoom("bedroom");
        abby = new Bedroom().visit(abby);

    }

    @GET
    public Resident getResident(@CookieParam("resident-name") String residentName) {
        Resident abby = Objects.requireNonNullElseGet(residents.get(residentName), () -> createResident(residentName));
        return abby;
    }

    @GET
    @Path("tracking")
    @Transactional
    public String getTracking() {
        new TrackerEntity().persist();
        long count = TrackerEntity.count();
        return "The alarm has been called " + count + " times.";
    }

    /*
     * Allow state to be visualised better by leaving pauses between rooms.
     */
    private void pause() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
