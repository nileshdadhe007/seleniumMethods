package parameterization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel11_printAllTypeDataInSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\nilesh software training\\xcell files\\Exampleofparameterization.xlsx");

		Sheet sh2 = WorkbookFactory.create(file).getSheet("Sheet4");

		int lastRowIndex = sh2.getLastRowNum();

		for (int i = 0; i <= lastRowIndex; i++) {
			int lastCellIndex = sh2.getRow(i).getLastCellNum() - 1;
			for (int j = 0; j <= lastCellIndex; j++) {
				Cell cellInfo = sh2.getRow(i).getCell(j);

				CellType actTypeOfCell = cellInfo.getCellType();

				if (actTypeOfCell == CellType.STRING) {
					System.out.print(cellInfo.getStringCellValue()+ " ");
				} 
				else if (actTypeOfCell == CellType.NUMERIC) {
					System.out.print(cellInfo.getNumericCellValue()+ " ");
				} 
				//else if (actTypeOfCell == CellType.BOOLEAN) 
				else
				{
					System.out.print(cellInfo.getBooleanCellValue()+ " ");
				}

			}
			System.out.println();

		}

	}
}