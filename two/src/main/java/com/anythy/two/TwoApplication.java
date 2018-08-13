package com.anythy.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwoApplication.class, args);
    }
}
