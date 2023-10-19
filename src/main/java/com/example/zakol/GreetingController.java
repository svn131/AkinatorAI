package com.example.zakol;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {
    @GetMapping("/")
    public String greeting() {
        System.out.println("был запрос на странцуууууууууууууууууууууууууууууууууууууууууууууууууууууу");
        return "Приветствуем вас в приложении!";
    }
}
