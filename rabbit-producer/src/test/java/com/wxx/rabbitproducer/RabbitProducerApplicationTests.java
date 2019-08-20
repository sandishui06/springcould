package com.wxx.rabbitproducer;

import com.wxx.config.RabbitProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitProducerApplicationTests {
    @Autowired
    private RabbitProducer producer;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 10; i++) {
            producer.stringSend();
        }
    }

}
