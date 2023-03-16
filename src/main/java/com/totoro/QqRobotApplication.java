package com.totoro;

import love.forte.simboot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSimbot
@SpringBootApplication
public class QqRobotApplication {

    public static void main(String[] args) {
        SpringApplication.run(QqRobotApplication.class, args);
    }

}
