package com.example.zakol.util;

import com.example.zakol.entity.Vopros;
import com.example.zakol.entity.Znamenitost;
import com.example.zakol.repository.Repository;
import jakarta.annotation.PostConstruct;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class PsrserExel {

    int nomerVoprosa = 1;


    @Autowired
    Repository repository;


    List<Vopros> voprosyLst = new ArrayList<>();

    List<Znamenitost> znamenitostList = new ArrayList<>();


    public PsrserExel() {
        Repository repository = new Repository();
        this.repository = repository;

    }

    @PostConstruct
    public void parsExel() throws Exception {


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


        // Вывод значений массивов
        System.out.println("Значения первой строки - знамиитости:");
        for (String value : firstRowValues) {
            Znamenitost znamenitost = new Znamenitost(value);
            znamenitostList.add(znamenitost);
            System.out.println(value);
        }

        System.out.println("Значения первого столбца:");


        for (String value : firstColumnValues) {
            Vopros vopros = new Vopros(nomerVoprosa, value);
            nomerVoprosa++;
            voprosyLst.add(vopros);
            System.out.println(value);
        }

        repository.setZnamenitost(znamenitostList);
        repository.setVoprosy(voprosyLst);


        workbook.close();
        file.close();

    }


}
