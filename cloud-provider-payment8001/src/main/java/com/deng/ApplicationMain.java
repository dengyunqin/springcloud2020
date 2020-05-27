package com.deng;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dengyunqing on 2020/5/27.
 */
@SpringBootApplication
@ComponentScan("com.deng")
@MapperScan("com.dneg.*.mapper")
public class ApplicationMain {
    public static void main(String[] arg0){
        SpringApplication.run(ApplicationMain.class,arg0);
    }
}
