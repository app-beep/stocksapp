package com.track.stocksapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    public SecurityController() {
    }

    @GetMapping({"/"})
    public String sayHello() {
        return "Hello";
    }

    @GetMapping({"/secured"})
    public String saySecuredHello() {
        return "Hello for the logged in user";
    }
}