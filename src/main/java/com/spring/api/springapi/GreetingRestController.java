package com.spring.api.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam (value = "name") String name) {
        return "Hello " + name  ;
    }

}
