package parameterization;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel6_readNumericDataAsString {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\nilesh software training\\xcell files\\Exampleofparameterization.xlsx");

		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(value);
		
		
	}
}