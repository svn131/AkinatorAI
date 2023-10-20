package com.example.zakol.repository;

import com.example.zakol.entity.Vopros;
import com.example.zakol.entity.Znamenitost;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@org.springframework.stereotype.Repository
public class Repository {


    List<Vopros> voprosList;

    List<Znamenitost> znamenitostList;




    public List<Vopros> getVoprosList() {
        return voprosList;
    }


    public void setVoprosList(List<Vopros> voprosList) {
        this.voprosList = voprosList;
    }

    public List<Znamenitost> getZnamenitosty() {
        return znamenitostList;
    }
//    public Znamenitost getZnamenitostList() {
//        Random random = new Random(2);
//        return znamenitostList.get(random);
//    }

    public void setZnamenitostList(List<Znamenitost> znamenitostList) {
        this.znamenitostList = znamenitostList;
    }
}
