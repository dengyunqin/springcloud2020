package com.deng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {
    public static void main(String[] arg0){
        SpringApplication.run(EurekaMain.class,arg0);
    }
}
