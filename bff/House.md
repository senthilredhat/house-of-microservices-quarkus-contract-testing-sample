# House

|  Description   |                         Value                         |
|----------------|-------------------------------------------------------|
| Date Generated | 2023-10-05T14:09:38.935681935-04:00[America/New_York] |
| Pact Version   | 4.6.3                                                 |

## Summary

|              Consumer              | Result |
|------------------------------------|--------|
| Pact between App (2.0.0) and House | Failed |
| Pact between App (2.0.1) and House | Failed |

## Verifying a pact between _Pact between App (2.0.0) and House_

Notices:
1. The pact at http://localhost:9292/pacts/provider/House/consumer/App/pact-version/1e8acc84cca70b758c76679e7cf8e0c7b7d909d6 is being verified because the pact content belongs to the consumer version matching the following criterion:
   * latest version of App that has a pact with House (2.0.0)

From `Pact Broker http://localhost:9292/pacts/provider/House/consumer/App/pact-version/1e8acc84cca70b758c76679e7cf8e0c7b7d909d6/metadata/c1tdW2xdPXRydWUmc1tdW2N2XT0xMQ`<br/>
a request for the resident  <br/>
&nbsp;&nbsp;returns a response which  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;includes headers  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"**Content-Type**" with value "**[application/json, application/json]**" (<span style='color:red'>FAILED</span>)

```
Expected header 'Content-Type' to have value 'application/json' but was ''
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  <br/>

Notices:
1. The pact at http://localhost:9292/pacts/provider/House/consumer/App/pact-version/1e8acc84cca70b758c76679e7cf8e0c7b7d909d6 is being verified because the pact content belongs to the consumer version matching the following criterion:
   * latest version of App that has a pact with House (2.0.0)

From `Pact Broker http://localhost:9292/pacts/provider/House/consumer/App/pact-version/1e8acc84cca70b758c76679e7cf8e0c7b7d909d6/metadata/c1tdW2xdPXRydWUmc1tdW2N2XT0xMQ`<br/>
a request for the resident  <br/>
&nbsp;&nbsp;returns a response which  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;includes headers  <br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"**Content-Type**" with value "**[application/json, application/json]**" (<span style='color:red'>FAILED</span>)

```
Expected header 'Content-Type' to have value 'application/json' but was ''
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  <br/>

## Verifying a pact between _Pact between App (2.0.1) and House_

Notices:
1. The pact at http://localhost:9292/pacts/provider/House/consumer/App/pact-version/3a316b26d60f230ad98bdd46f05c998334b1faf8 is being verified because the pact content belongs to the consumer version matching the following criterion:
   * latest version of App that has a pact with House (2.0.1)

From `Pact Broker http://localhost:9292/pacts/provider/House/consumer/App/pact-version/3a316b26d60f230ad98bdd46f05c998334b1faf8/metadata/c1tdW2xdPXRydWUmc1tdW2N2XT0xMw`<br/>
a request for the resident  <br/>
&nbsp;&nbsp;returns a response which  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  <br/>

Notices:
1. The pact at http://localhost:9292/pacts/provider/House/consumer/App/pact-version/3a316b26d60f230ad98bdd46f05c998334b1faf8 is being verified because the pact content belongs to the consumer version matching the following criterion:
   * latest version of App that has a pact with House (2.0.1)

From `Pact Broker http://localhost:9292/pacts/provider/House/consumer/App/pact-version/3a316b26d60f230ad98bdd46f05c998334b1faf8/metadata/c1tdW2xdPXRydWUmc1tdW2N2XT0xMw`<br/>
a request for the resident  <br/>
&nbsp;&nbsp;returns a response which  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  <br/>

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)

```
Ok(value=BodyComparisonResult(mismatches={$.torso.state=[BodyMismatch(expected=full, actual=bloated, mismatch=Expected 'bloated' to match '^(full|hungry)$', path=$.torso.state, diff=null)]}, diff=[{,   "eyes": {,     "state": "awake",   },,   "hair": {,     "state": "frizzled",   },,   "head": {, ,   },,   "legs": {, ,   },, -  "room": "kitchen",, +  "room": "bedroom",,   "torso": {, -    "state": "full", +    "state": "bloated",   }, }]))
```

Notices:
1. The pact at http://localhost:9292/pacts/provider/House/consumer/App/pact-version/3a316b26d60f230ad98bdd46f05c998334b1faf8 is being verified because the pact content belongs to the consumer version matching the following criterion:
   * latest version of App that has a pact with House (2.0.1)

From `Pact Broker http://localhost:9292/pacts/provider/House/consumer/App/pact-version/3a316b26d60f230ad98bdd46f05c998334b1faf8/metadata/c1tdW2xdPXRydWUmc1tdW2N2XT0xMw`<br/>
a request for the resident  <br/>
&nbsp;&nbsp;returns a response which  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  <br/>
