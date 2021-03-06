package com.deng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dengyunqing on 2020/5/27.
 */
@SpringBootApplication
@ComponentScan("com.deng.*")
@EnableEurekaClient
public class ApplicationMain8001 {
    public static void main(String[] arg0){
        SpringApplication.run(ApplicationMain8001.class,arg0);
    }
}
