package com.wxx.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wxx on 2019/6/18.
 */

@Configuration
public class RabbitConfig {

/*
    */
/**
     * 定义队列名
     *//*

    private final static String STRING = "string";
    */
/**
     * 定义string队列
     * @return
     *//*

    @Bean
    public Queue string() {
        return new Queue(STRING);
    }
*/

    /**
     * 定义队列名
     */
    private final static String STRINGS = "wxx";
    /**
     * 定义string队列
     * @return
     */
    @Bean
    public Queue strings() {
        return new Queue(STRINGS);
    }

}
