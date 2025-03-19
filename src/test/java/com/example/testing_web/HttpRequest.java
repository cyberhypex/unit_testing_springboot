package com.example.testing_web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.web.client.RestTemplate;


public class HttpRequest {


    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;


    void greetingShouldReturnDefaultMessage(){
        assertThat(this.testRestTemplate.getForObject("http://localhost:"+port+"/",String.class)).contains("Hello,World");
    }

}
