package com.danny.JenkinsHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsHelloWorldController {

    @RequestMapping("/")
    public String helloWorld() {
        return "helloWorld";
    }

}