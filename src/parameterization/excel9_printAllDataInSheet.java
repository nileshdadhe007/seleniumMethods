package parameterization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel9_printAllDataInSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\nilesh software training\\xcell files\\Exampleofparameterization.xlsx");
		
		Sheet sh3 = WorkbookFactory.create(file).getSheet("Sheet3");
		
		
		int lastRowIndex = sh3.getLastRowNum();
		
		for (int i = 0; i <=lastRowIndex; i++) 
		{
			int lastCellIndex = sh3.getRow(i).getLastCellNum()-1;
			for (int j = 0; j <=lastCellIndex; j++)
			{
				String value = sh3.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"|");
			}
			
			System.out.println();
			
		}

	}
}