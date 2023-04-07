package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StingCellValue {
	


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Selenium Parameter\\Demoparameterization.xlsx");
	//	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
	//   System.out.println(data);
		
	//	-----------------------------------------numeric cell value---------------------------------------------------------------------------
	//	double data = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(2).getNumericCellValue();
	//	System.out.println(data);

//-----------------------------------------------------last row number------------------------------------------------------------------------------------------
		
		int lastRowNumber = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
		System.out.println(lastRowNumber+1);
}
}