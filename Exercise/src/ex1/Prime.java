package ex1;

import java.util.Scanner;

public class Prime {
	

	
public static void main(String[] args) {
	
	 
	Scanner s= new Scanner(System.in);
	System.out.println("Enter number");
	int num=s.nextInt();
	
	
	for(int i=2; i<= num/2; i++ )


	 if(num %i==0)
			{
		    	   
			
			System.out.println("Not prime");
			}
				else
				{
					System.out.println("Prime");
				}}
}

