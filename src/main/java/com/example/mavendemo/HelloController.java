package com.example.mavendemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from sreeja pathi DevOPS Class Today - Aug 19 2023 - Version 3!";
    }

}
