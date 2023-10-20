package com.example.zakol.controller;

import com.example.zakol.entity.Vopros;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControlStart {

    // GET-запрос для получения начального вопроса и изображения
//    @GetMapping("/")
//    public String getInitialQuestion(Model model) {
//        System.out.println("Вызван getInitialQuestion");
//        Vopros vopros = new Vopros(0, "Сыграем ?");
//        model.addAttribute("vopros", vopros);
//        return "index";
//    }

    @GetMapping("/")
    public String getInitialQuestion(Model model) {
        System.out.println("Вызван getInitialQuestion");
//        Vopros vopros = new Vopros(0, "Сыграем ?");
        model.addAttribute("vopros", "Сыграем ?");
        return "test";
    }

}
