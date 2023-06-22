import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountDatExcel {

	public static void main(String[] args) {
		//spcify the path of the file
		String filePath="data.xlsx";
		try {
			FileInputStream inptstream=new FileInputStream(filePath);
			XSSFWorkbook workbook=new XSSFWorkbook(inptstream);
			
			
			Sheet sheet=workbook.getSheetAt(0);
			int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
			System.out.println("Number of Rows are:" +rowcount);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
