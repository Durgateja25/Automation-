package com.Calculator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.FileOutputStream;

public class ExcelReport_Util implements ITestListener {

    Workbook workbook;
    Sheet sheet;
    int rowNum = 0;

    @Override
    public void onStart(ITestContext context) {
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Test Results");

        Row header = sheet.createRow(rowNum++);
        header.createCell(0).setCellValue("Test Name");
        header.createCell(1).setCellValue("Status");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        writeResult(result.getName(), "PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        writeResult(result.getName(), "FAIL");
    }

    @Override
    public void onFinish(ITestContext context) {
        try {
            FileOutputStream fos = new FileOutputStream("TestResults.xlsx");
            workbook.write(fos);
            fos.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeResult(String testName, String status) {
        Row row = sheet.createRow(rowNum++);
        row.createCell(0).setCellValue(testName);
        row.createCell(1).setCellValue(status);
    }
}