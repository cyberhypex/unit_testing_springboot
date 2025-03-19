package com.example.testing_web;

import com.example.testing_web.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


public class SmokeTest {

    @Autowired
    private HomeController homeController;


    void contextLoads() throws Exception {
        assertThat(homeController).isNotNull();
    }
}
