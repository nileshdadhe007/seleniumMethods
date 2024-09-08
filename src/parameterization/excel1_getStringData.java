package parameterization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel1_getStringData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file =new FileInputStream("C:\\nilesh software training\\xcell files\\Exampleofparameterization.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	System.out.println(value);
	
	
//	Workbook book = WorkbookFactory.create(file);
//	Sheet sh = book.getSheet("Sheet1");
//	Row row = sh.getRow(0);
//	Cell cell = row.getCell(2);
//	String value = cell.getStringCellValue();
//	System.out.println(value);

}
}