package com.github.dariodasilva;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CrudResoruceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello-resteasy")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}