//package com.example.zakol;
//
//import org.aspectj.weaver.patterns.TypePatternQuestions;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class QuestionController {
//
//    private static final List<TypePatternQuestions.Question> questions = new ArrayList<>(); // Список вопросов
//
//    // Конструктор для инициализации списка вопросов
//    public QuestionController() {
//        questions.add(new TypePatternQuestions.Question("Вопрос 1", "C:/images/1.jpg"));
//        questions.add(new TypePatternQuestions.Question("Вопрос 2", "/images/2.jpg"));
//        // Добавьте остальные вопросы и изображения
//    }
//
//    // GET-запрос для получения начального вопроса и изображения
//    @GetMapping("/")
//    public TypePatternQuestions.Question getInitialQuestion() {
//        return questions.get(0);
//    }
//
//    // POST-запрос для обработки ответов пользователя
//    @PostMapping("/answer")
//    public TypePatternQuestions.Question getNextQuestion(@RequestBody Answer answer) {
//        int index = answer.getIndex();
//        // Здесь вы можете добавить логику для выбора следующего вопроса на основе ответа пользователя
//        if (index < questions.size()) {
//            return questions.get(index);
//        } else {
//            // Возвращаем заглушку, если вопросы закончились
//            return new TypePatternQuestions.Question("Спасибо за игру!", "");
//        }
//    }
//}
