package com.wxx.adminprovide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by controller on 2019/6/12.
 */
@Controller
public class Test {

    @ResponseBody
    @RequestMapping("/test")
    public String Test(){
        return "hello,wxx";
    }
}
