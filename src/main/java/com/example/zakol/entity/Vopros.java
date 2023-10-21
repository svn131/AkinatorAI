package com.example.zakol.entity;

//
//import org.springframework.stereotype.Component;


import org.springframework.context.annotation.Scope;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Scope("prototype")
public class Vopros {

   @Id
    private Long id;


    int index;

    String value;


    public Vopros() {
    }

    public Vopros(int index, String value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
