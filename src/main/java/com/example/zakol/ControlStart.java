package com.example.zakol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControlStart {

    // GET-запрос для получения начального вопроса и изображения
    @GetMapping("/")
    public String getInitialQuestion() {
        System.out.println("Вызван getInitialQuestiongetInitialQuestiongetInitialQuestiongetInitialQuestion");
        return "index";
    }

}
