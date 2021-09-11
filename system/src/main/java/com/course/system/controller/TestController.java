package com.course.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Angelo
 * @date 2021/9/10 18:14
 **/
@RestController
//@RequestMapping("/system")
public class TestController {


    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
