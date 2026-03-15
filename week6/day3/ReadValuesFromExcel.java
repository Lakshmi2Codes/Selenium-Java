package week6.day3;


	
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


	public class ReadValuesFromExcel {
	        
	        
		public static String[][] getValue(String fileName) throws IOException {
			
			  FileInputStream fis = new FileInputStream("ReadValueExcel/" + fileName + ".xlsx");

	    		// Step1: Settingup the excel file / workBook
			XSSFWorkbook wb = new XSSFWorkbook(fis);

	    		// Step2: to get the sheet from the wb
	    		XSSFSheet sheet = wb.getSheetAt(0);

//	    		// Step3: to get the row value
//	    		XSSFRow row = sheet.getRow(0);

	    		// System.out.println(row);

	    		// getLastRowNum(); - excludes the Header
	    		int lastRowNum = sheet.getLastRowNum();
//	    		System.out.println(lastRowNum);

	    		// getPhysicalNumberOfRows(); - includes the header
//	    		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//	    		System.out.println(physicalNumberOfRows);

	    		// get the cell/column value
//	    		XSSFCell getCell = sheet.getRow(2).getCell(1);
////	    		System.out.println(getCell);

//	    		// to get the cell value along with the header
//	    		int physicalNumberOfCells = sheet.getRow(1).getPhysicalNumberOfCells();
//	    		System.out.println(physicalNumberOfCells);

	    		// getLastCellNum();
	    		short lastCellNum = sheet.getRow(2).getLastCellNum();
//	    		System.out.println(lastCellNum);
	    		
	    		String[][] data = new String[lastRowNum][lastCellNum];

//	    		// store the cell values
//	    		XSSFCell cell = row.getCell(1);
//	    		System.out.println (cell + "value");
	    		
	    		// OuterLoop is for rows
	    		

	    		// inside getValue method
	    		DataFormatter formatter = new DataFormatter();

	    		for (int i = 1; i <= lastRowNum; i++) {  // skip header
	    		    XSSFRow row1 = sheet.getRow(i);
	    		    for (int j = 0; j < lastCellNum; j++) {
	    		        XSSFCell cell1 = row1.getCell(j);
	    		        String value = (cell1 == null) ? "" : formatter.formatCellValue(cell1);
	    		        data[i - 1][j] = value;
	    		        
	    		        System.out.println("LegalEntity Name is:" + value);
	    		        
	    		    }
	    		}
	    							
	    		
	    		return data;
	    }
	    	}
				