package com.FileProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileWrite {
	//Writetofile
	public static void fileWrite() throws IOException {
		File f =new File("C:\\Users\\lenovo\\eclipse-workspace\\MiniProjectMaven\\FileWrite.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s1 = wb.createSheet("Data");
		s1.createRow(0).createCell(0).setCellValue("UserName");
		s1.getRow(0).createCell(1).setCellValue("Password");
		s1.createRow(1).createCell(0).setCellValue("Dhivya");
		s1.getRow(1).createCell(1).setCellValue("Dp@17");
		s1.createRow(2).createCell(0).setCellValue("Rocky");
		s1.getRow(2).createCell(1).setCellValue("rocky@20");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Written Success");
	}
	public static void main(String[] args) throws IOException {
	fileWrite();	

	}

}
