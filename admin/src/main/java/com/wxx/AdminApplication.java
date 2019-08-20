package com.wxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @EnableDiscoveryClient 这个注解 标识这是一个服务,向服务中心注册
 * 禁止spring boot自动配置数据源   exclude={DataSourceAutoConfiguration.class}
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
