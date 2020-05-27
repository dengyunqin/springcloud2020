package com.deng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dengyunqing on 2020/5/27.
 */
@SpringBootApplication
@ComponentScan("com.deng.*")
public class ApplicationConsumerMain {

    public static void main(String[] arg0){
        SpringApplication.run(ApplicationConsumerMain.class,arg0);
    }
}
