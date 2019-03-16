package ex1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Method1
{
	
	public String method(String str,int r, int c) throws BiffException, IOException
	{
	

	File f= new File("C:\\Users\\lenovo\\Desktop\\New Folder\\1548395447943Role+.xlsx.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	 r=ws.getRows();
	c=ws.getColumns();
	
	for(int i=0; i<r; i++)
	{
		for(int j=0; j<c; j++)
		{
		Cell c1=ws.getCell(j, i);
		Cell a;
		
		/* String e;
		int k=0;*/
		
		
		
			
			if(ws.getCell(j, i)==a)
			{
				System.out.println(c1.getContents());
				break;
				
			
	
	
	}
		


	
	}

	}
	return str ;
	}
	
	
	public static void main(String[] args) throws BiffException, IOException {
		Method1 obj=new Method1();
		obj.method("C:\\Users\\\\lenovo\\Desktop\\New Folder\\1548395447943Role+.xlsx.xls", 3, 4);
		
	}
}
	