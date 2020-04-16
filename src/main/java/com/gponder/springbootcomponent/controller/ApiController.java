package com.gponder.springbootcomponent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author gponder
 * @Email gponder.g@gmail.com
 * @create 2020/3/23 17:15
 */
@RestController
@RequestMapping("api")
public class ApiController {

    @GetMapping()
    public String api(){
        return "get api";
    }

}
