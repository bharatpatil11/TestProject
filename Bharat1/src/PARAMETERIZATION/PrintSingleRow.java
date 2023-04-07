package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class PrintSingleRow {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Selenium Parameter\\Demoparameterization.xlsx");
	org.apache.poi.ss.usermodel.Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
	
	for(int i=0; i<=sheet1.getLastRowNum();i++) {
		
		for (int j=0; j<=sheet1.getRow(i).getLastCellNum()-1;j++) {
			String data = sheet1.getRow(i).getCell(j).getStringCellValue();
			System.out.print(" " +data);
		 
	}
		System.out.println();

}
}
}