package com.bugking.tweet.eureka;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
//        new SpringApplicationBuilder(EurekaApplication.class).web(WebApplicationType.SERVLET).run(args);
    	SpringApplication.run(EurekaApplication.class, args);
    }
}
