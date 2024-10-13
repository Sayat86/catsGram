package com.example.catsgramapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RestController
public class SimpleController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(SimpleController.class);
    @RequestMapping("/home")
    public String homePage() {
        log.info("Получен запрос");
        return "Котограм";
    }
}
