package com.example.designpattern.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MainController
 */
@RestController
public class MainController {

    @GetMapping("/hi")
    public String hello(){
        return "Hi";
    }
}