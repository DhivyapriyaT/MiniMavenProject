package com.FileProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileExcelRead {
	public static void particularData() throws IOException {
		// Particular Data
		File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\MiniProjectMaven\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		} else if (cellType.equals(cellType.NUMERIC)) {
			double numeric = cell.getNumericCellValue();
			int value = (int) numeric;// narrow casting
			System.out.println(value);
		}
	}

	// RowData
	public static void rowReading() throws IOException {
		System.out.println("Row Details: ");
		File f1 = new File("C:\\Users\\lenovo\\eclipse-workspace\\MiniProjectMaven\\Book1.xlsx");
		FileInputStream fis1 = new FileInputStream(f1);
		Workbook wb1 = new XSSFWorkbook(fis1);
		Sheet sheet1 = wb1.getSheet("Sheet1");
		int rowSize = sheet1.getPhysicalNumberOfRows();
		System.out.println(rowSize);

		Row row1 = sheet1.getRow(2);
		int cellSize = row1.getPhysicalNumberOfCells();
		for (int i = 0; i < cellSize; i++) {
			
			Cell cell1 = row1.getCell(cellSize);
			CellType type = cell1.getCellType();

			if (type.equals(type.STRING)) {
				String value = cell1.getStringCellValue();
				System.out.println(value);
			} else if (type.equals(type.NUMERIC)) {
				double numeric = cell1.getNumericCellValue();
				int value = (int) numeric;// narrowcasting
				System.out.println(value);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		particularData();
		rowReading();
	}

}
