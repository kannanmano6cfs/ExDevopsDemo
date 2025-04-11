package com.learning.exkubedemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/")
    public String index() {
        return "Hello FSSTECH!! I am running from PODs added to Kubernetes!!";
    }
}
