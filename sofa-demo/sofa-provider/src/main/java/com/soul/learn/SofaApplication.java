package com.soul.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yuchen.wu
 * @date 2021-01-19
 */
@ImportResource({ "classpath*:invoke-server-example.xml"})
@SpringBootApplication
public class SofaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofaApplication.class, args);
    }

}
