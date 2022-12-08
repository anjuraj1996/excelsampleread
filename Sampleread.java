package pack1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sampleread {
	@SuppressWarnings("resource")
	
	public static void main(String args[]) throws IOException {
		FileInputStream f=new FileInputStream(new File("D:\\Books.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		for(Row row: sheet) {
			for(Cell cell:row)
			{
				System.out.println(cell+"\t\n");
			}
		}
		
		
	}

}

