
// using try n catch blocks //

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) 
	{
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("connection is establised");
		System.out.println("enter the numertor");
		int a=scan.nextInt();
		System.out.println("enter the denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		System.out.println("please enter a non zero denominator");
	}
	    System.out.println("connection is terminaed");	
}
}
