package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 25225 on 2017/11/1.
 */
@RestController
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello Spring boot!";
    }
}
