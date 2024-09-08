package parameterization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel7_printAllColInARow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\nilesh software training\\xcell files\\Exampleofparameterization.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastCellIndex = sh.getRow(0).getLastCellNum();
		
		for (int i = 0; i <lastCellIndex ; i++) {
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		
		
	}
}
