package sample.house;

import au.com.dius.pact.provider.junitsupport.VerificationReports;
import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

import io.quarkus.test.junit.QuarkusTest;

import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.Provider;

@Provider("House")
@PactBroker(url = "http://localhost:9292")
@VerificationReports(value = {"console", "markdown"}, reportDir = "./")
@QuarkusTest // This starts the server for convenience in testing
public class HouseContractTest {

	@BeforeAll
	public static void setup() {
		System.setProperty("pact.verifier.publishResults", "true");
		System.setProperty("pact_do_not_track", "true");
	}

	@BeforeEach
	void beforeEach(PactVerificationContext context) {
		context.setTarget(new HttpTestTarget("localhost", this.quarkusPort));
	}

	@ConfigProperty(name = "quarkus.http.test-port")
	int quarkusPort;

	@BeforeEach
	void before(PactVerificationContext context) {
		context.setTarget(new HttpTestTarget("localhost", quarkusPort));
	}

	@TestTemplate
	@ExtendWith(PactVerificationInvocationContextProvider.class)
	void pactVerificationTestTemplate(PactVerificationContext context) {
		context.verifyInteraction();
	}

}
