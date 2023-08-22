package com.sleepingbranch.starterspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping
    public String hi() {
        return "adwadadwad";
    }
}
