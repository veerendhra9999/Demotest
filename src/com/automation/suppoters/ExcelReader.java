 package com.automation.suppoters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	private String FilePath;
	private  FileInputStream fip;
    private Workbook workbook;
	public ExcelReader(String FilePath) throws EncryptedDocumentException, InvalidFormatException, IOException {
		this.FilePath=FilePath;
		 fip=new FileInputStream(FilePath);
		workbook=WorkbookFactory.create(fip);
	}
	public Sheet getSheet(String sheetName) {
		Sheet sheet=null;
		if (workbook!=null)
	
		{
		        sheet =workbook.getSheet(sheetName);
		}
		else
		System.out.println("workbook is printing to Null");
		return sheet;
	}
	
		public int  getTotalNoofRows(String SheetName) {
			Sheet Sheet=getSheet(SheetName);
			int rowsCount=Sheet.getLastRowNum()+1;
			return rowsCount;
			//return getSheet(SheetName).getLastRowNum()+1;
		}
		
		public int getTotalNoOfCells(String SheetName,int rowNum) {
			return getSheet(SheetName).getRow(rowNum).getLastCellNum();
		}
		public String getCellData(String SheetName,int rowNum,int CellNum) {
			String CellValue=null;
			Cell cell=getSheet(SheetName).getRow(rowNum).getCell(CellNum);
			if(cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
				CellValue=cell.getNumericCellValue()+"";
			}
			else if(cell.getCellType()==cell.CELL_TYPE_STRING) {
				CellValue=cell.getStringCellValue();
			}
			return CellValue;
		}
		public List<String> getTotalCellData(String SheetName){
			List<String> list=new ArrayList<String>();
			Sheet sheet=getSheet(SheetName);
			for(int i=0;i<sheet.getLastRowNum()+1;i++) {
				String cellValue=null;
				Row row=sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell=row.getCell(j);
				if(cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
					cellValue = cell.getNumericCellValue()+"";
					list.add(cellValue);
				}
				else if(cell.getCellType()==cell.CELL_TYPE_STRING){
					cellValue = cell.getStringCellValue();
					list.add(cellValue);
				}
				}
			}
			return list;
		}
			public void writeData (String sheetName, int rowNum ,int cellNum, String data) throws IOException {
				getSheet(sheetName).createRow(rowNum).createCell(cellNum).setCellValue(data);
				FileOutputStream fop=new FileOutputStream(FilePath);
				workbook.write(fop);
				
				
			}
		
		
	}


