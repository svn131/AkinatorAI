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
        List<String> firstRowValues = new ArrayList<>();

        for (int i = 0; i < numCells; i++) {
            Cell cell = headerRow.getCell(i);

            if (cell != null && cell.getCellType() == CellType.STRING) {
                String cellValue = cell.getStringCellValue();
                firstRowValues.add(cellValue);
            }
        }

// Преобразование ArrayList в массив
        String[] firstRowArray = firstRowValues.toArray(new String[0]);


        // Парсинг значений первого столбца в массив
        int numRows = sheet.getLastRowNum() + 1;
        List<String> firstColumnValues = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0);

            if (cell != null && cell.getCellType() == CellType.STRING) {
                String cellValue = cell.getStringCellValue().trim();
                if (!cellValue.isEmpty()) {
                    firstColumnValues.add(cellValue);
                }
            }
        }

// Преобразование ArrayList в массив
        String[] firstColumnArray = firstColumnValues.toArray(new String[0]);


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


