package ex1;

import java.util.Scanner;

public class Rangeprime {
	
	
public static void main(String[] args) {
	
	 
	
	
	
	for(int j=2; j<=50;j++)
	
	{
		int a=0;
	for(int i=2; i<= j/2; i++ )
	{
		
         
	 if(j%i==0)
			
	 {	  
	
	 a++;
	 break;
	}
	}
	
	if(a==0)
	{
		System.out.println("Prime num " + j);
		
	}
	//System.out.println(j);
	
	}

}
}
	
