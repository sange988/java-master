package com.company.project.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "This is what was modified by the manual append step";
    }
}