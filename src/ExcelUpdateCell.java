import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdateCell {

	public static void main(String[] args) {
		String filePath="data.xlsx";
		try {
			
			FileInputStream inpstr=new FileInputStream(filePath);
			Workbook workbook=new XSSFWorkbook(inpstr);
			
			Sheet sheet=workbook.getSheetAt(0);
			Row row=sheet.getRow(1);
			Cell cell=row.getCell(2);
			
			//update the cell data
			cell.setCellValue("Mumbai");
			
			//Write the data to excel file
			
			FileOutputStream outstr=new FileOutputStream(filePath);
			workbook.write(outstr);
			workbook.close();
			outstr.close();
			System.out.println("Cell value in sheet has beed Updated");
		
		} catch (IOException e) {
		 e.printStackTrace();
		}

	}

}
