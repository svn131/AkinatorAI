package com.example.zakol;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class ZakolApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ZakolApplication.class, args);

        ZakolApplication zakolApplication = new ZakolApplication();
        zakolApplication.run();

        System.out.println("555555555555555555555555555555555555555555555555555555555");
    }

    private void run() throws Exception {


            FileInputStream file = new FileInputStream("C:/AkinatorAI.xlsx");

            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0); // Получение первого листа

            // Получение количества ячеек в первой строке
            Row headerRow = sheet.getRow(0);
            int numCells = headerRow.getLastCellNum();

            // Парсинг значений первой строки в массив
            String[] firstRowValues = new String[numCells];
            for (int i = 0; i < numCells; i++) {
                Cell cell = headerRow.getCell(i);
                firstRowValues[i] = cell.getStringCellValue();
            }

            // Парсинг значений первого столбца в массив
            int numRows = sheet.getLastRowNum() + 1;
            String[] firstColumnValues = new String[numRows];
            for (int i = 0; i < numRows; i++) {
                Row row = sheet.getRow(i);
                Cell cell = row.getCell(0);
                firstColumnValues[i] = cell.getStringCellValue();
            }

            // Вывод значений массивов
            System.out.println("Значения первой строки:");
            for (String value : firstRowValues) {
                System.out.println(value);
            }

            System.out.println("Значения первого столбца:");
            for (String value : firstColumnValues) {
                System.out.println(value);
            }

            workbook.close();
            file.close();

    }



    }


