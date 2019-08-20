package com.wxx.controller;

import com.wxx.service.Testoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by wxx on 2019/6/12.
 */
@Controller
public class Test {

    @Autowired
    private Testoo testoo;

    @ResponseBody
    @RequestMapping("/test.do")
    public String test(){
        return testoo.aa();
    }
}
