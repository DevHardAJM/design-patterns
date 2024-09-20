package com.example.designpattern.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.designpattern.observer.MainStore;

/**
 * MainController
 */
@RestController
public class MainController {

    @GetMapping("/hi")
    public String hello(){
        MainStore.simulateObserver();
        return "Hi";
    }
}