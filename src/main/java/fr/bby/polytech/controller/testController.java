package fr.bby.polytech.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/user")
@CrossOrigin
public class testController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
