package com.example.zakol.controller;


import com.example.zakol.repository.Repository;
import com.example.zakol.entity.Vopros;
import com.example.zakol.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class QuestionController {

    @Autowired
    Repository repository;
    @Autowired
    PlayService playService; // todo в кострукор


    public QuestionController() {
    }

    @Autowired // todo Лишняя ?
    // Конструктор для инициализации списка вопросов
    public QuestionController(Repository repository) {

        // Добавьте остальные вопросы и изображения
    }


    // POST-запрос для обработки ответов пользователя
    @PostMapping("/cycl")
    public ResponseEntity<Vopros> getNextQuestion(@RequestBody Map<String, Object> requestBody) {
        boolean otvetBoolean = (boolean) requestBody.get("otvetBoolean");
        // Здесь вы можете добавить логику для выбора следующего вопроса на основе ответа пользователя
        if (otvetBoolean) {
            Vopros nextQuestion = repository.getVoprosy().get(2);
            return ResponseEntity.ok(nextQuestion);
        } else {
            Vopros endGameResponse = new Vopros(3002, "Спасибо за игру!");
            return ResponseEntity.ok(endGameResponse);
        }

    }

}
