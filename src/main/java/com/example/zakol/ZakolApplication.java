package com.example.zakol;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ZakolApplication {

    List<Vopros> voprosy = new ArrayList<>() ;

    List<Znamenitost>  znamenitost  = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        SpringApplication.run(ZakolApplication.class, args);

        ZakolApplication zakolApplication = new ZakolApplication();
        zakolApplication.run();





        System.out.println("555555555555555555555555555555555555555555555555555555555");
    }

    public  void run() throws Exception {
        PsrserExel psrserExel = new PsrserExel(voprosy, znamenitost);
        psrserExel.parsExel();
    }




}


