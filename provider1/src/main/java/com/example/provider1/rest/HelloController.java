package com.example.provider1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description :
 * Copyright: Copyright (c)2019
 * Created Date : 2020/1/7
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;

    @Value("${user.id}")
    private int id;

    @RequestMapping("/he")
    public String hello(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);


        return "hello";
    }




}
