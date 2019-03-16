package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("unused")
public class ReadMethod {
	
	
	
	public void read() throws IOException
	{
		File f=new File("C:\\Users\\lenovo\\Desktop\\r.txt");
		FileReader fr=new FileReader(f);
	
		
		int a;
		while((a=fr.read())!=-1)
			
			System.out.print((char)a);
		fr.close();
	}
	
	
public static void main(String[] args) throws IOException {
	ReadMethod obj=new ReadMethod();
	obj.read();

}
}
