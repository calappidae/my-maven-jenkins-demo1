package com.example.mymavenjenkinsdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * @Classname HelloWorldController
 * @Date 2022/11/9 14:43
 * @Author by panjianhao
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/test/{name}")
    public String test(@PathVariable("name") String name){
        return name;
    }
}
