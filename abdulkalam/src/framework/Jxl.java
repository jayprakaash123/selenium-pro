package framework;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import jxl.write.Number;

public class Jxl {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		// open excel file for reading
		File f=new File("D:\\Book1.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();//get number of used row
		int nouc=rsh.getColumns();//get number of used column
		
		//open same excel file for output writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//Data driven from excel sheet
		for(int i=1;i<nour;i++) 
		{
			int x=Integer.parseInt(rsh.getCell(0, i).getContents());
			int y=Integer.parseInt(rsh.getCell(1,i).getContents());
			int z=x+y;
			Number n=new Number(2,i,z);
			wsh.addCell(n);
		}
		//save and close excel file
		wwb.write();
		wwb.close();
		rwb.close();
		
	}

}
