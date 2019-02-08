package ex1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Method1
{
	
	public String method(String str,int a) throws BiffException, IOException
	{
	

	File f= new File("C:\\Users\\lenovo\\Desktop\\New Folder\\1548395447943Role+.xlsx.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	
	for(int i=1; i<r; i++)
	{
		for(int j=1; j<c; j++)
		{
		Cell c1=ws.getCell(j, i);
		System.out.println(c1.getContents());
		
	int b=0;
	String e;
	
	while((e=c1.getContents())!=null)
	{
		
		b=b+1;
	
	if(b==a)
	
	{
		break;
	
	}
	}
		
	ws.getClass();
	System.out.println(a);
	return e;
	}
	}}
	public static void main(String[] args) throws BiffException, IOException {
		Method1 obj=new Method1();
		obj.method("C:\\Users\\\\lenovo\\Desktop\\New Folder\\1548395447943Role+.xlsx.xls", 4);
	}
}
	