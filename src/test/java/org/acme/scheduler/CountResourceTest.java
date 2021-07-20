package org.acme.scheduler;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class CountResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/count")
          .then()
            .statusCode(200)
            .body(containsString("count")); 
    }

}