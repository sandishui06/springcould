package com.wxx.adminprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdminprovideApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminprovideApplication.class, args);
    }

}
