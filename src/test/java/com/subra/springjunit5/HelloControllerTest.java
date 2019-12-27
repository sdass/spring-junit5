package com.subra.springjunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {
    //bind above RANDOM_PORT
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate trestTemplate;

    @Test
    public void getTestingHello() throws URISyntaxException {
         ResponseEntity<String> response = trestTemplate.getForEntity( new URI("http://localhost:" + port + "/val").toString(), String.class);
         String expected = "DBHello Jupiter api Junit-5";
        Assertions.assertEquals(expected, response.getBody());
    }
}
