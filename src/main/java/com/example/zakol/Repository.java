package com.example.zakol;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Repository {


    List<Vopros> voprosy  ;

    List<Znamenitost>  znamenitost ;


    public List<Vopros> getVoprosy() {
        return voprosy;
    }

    public void setVoprosy(List<Vopros> voprosy) {
        this.voprosy = voprosy;
    }

    public List<Znamenitost> getZnamenitost() {
        return znamenitost;
    }

    public void setZnamenitost(List<Znamenitost> znamenitost) {
        this.znamenitost = znamenitost;
    }
}
