package com.example.zakol.controller;


import com.example.zakol.entity.Vopros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.security.Principal;


@RestController
@RequestMapping("/vopros")
public class UserRestController {
         Vopros vopros;



    @GetMapping()
    public ResponseEntity<Vopros> getVopros(Principal principal) {
        System.out.println("777777777777777777777777777777777777777777777777777777777777777777");
        Vopros vopros = new Vopros(1,"Гдеееееееееееееееееееееееееееееееее");
        return ResponseEntity.ok(vopros);
    }



    //    @Autowired
//    public UserRestController(UserService userService) {
//        this.userService = userService;
//    }
}
