package com.wxx.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wxx on 2019/6/12.
 */
/*
* name调用服务提供者在properties里得name，url在消费者properties配置得
* */
@FeignClient(name="adminprovide",url = "${feign.url}")
public interface Testoo {

    @RequestMapping("/test")
    String aa();
}
