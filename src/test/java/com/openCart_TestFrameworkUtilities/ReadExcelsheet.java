package com.openCart_TestFrameworkUtilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelsheet {
	
	public static HashMap<String,String> readData(String sheetName, int rowNumber){
		File fs=new File(ReadConfigFile.getProp().getProperty("excelSheet"));
		HashMap<String,String> map;
		List<HashMap<String,String>> dataList=new ArrayList<HashMap<String,String>>();
		
		try {
			XSSFWorkbook wb=new XSSFWorkbook(fs);
			XSSFSheet sheet=wb.getSheet(sheetName);
			XSSFCell cell;
			
			int rows=sheet.getPhysicalNumberOfRows();
			int columns=sheet.getRow(0).getLastCellNum();
			
			for(int i=1; i<rows;i++) {
				map=new HashMap<String,String>();
				for(int j=0;j<columns;j++) {
					cell=sheet.getRow(i).getCell(j);
					String key=sheet.getRow(0).getCell(j).toString();
					
					if(cell==null) map.put(key," ");
					else map.put(key, cell.toString());
					
				}
				dataList.add(map);
				map=null;
			}
			wb.close();

			
		} catch (InvalidFormatException | IOException e) {
			
			e.printStackTrace();
		}
		return dataList.get(rowNumber);
		
	}
	
	

}
