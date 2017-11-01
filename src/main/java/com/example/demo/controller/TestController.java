package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 25225 on 2017/11/1.
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    void test(){
        System.out.println("test");
    }

    @RequestMapping("/abc")
    void abc(){
        System.out.println("abc");
    }
}
