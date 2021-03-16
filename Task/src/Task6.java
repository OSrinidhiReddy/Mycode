// nested catch blocks

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
	try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("connection is establised");
		System.out.println("enter the numertor");
		int a=scan.nextInt();
		System.out.println("enter the denominator");
		int b=scan.nextInt();
		int c=a/b; //Arithmetic Exception 
	    System.out.println(c);
		
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int[] ar= new int[size];//Negative Array Size Exception
		
	    System.out.println("enter the element to be storted");
		int elem=scan.nextInt();// Array Index out of Bounds Exception
		System.out.println("enter the position at which elem has to be inserted");
		int pos=scan.nextInt();
	    ar[pos]= elem;
		}
	    
		
	catch(ArithmeticException e)
	   {
	   System.out.println("please enter a non zero denominator");
	   }
		
	catch(NegativeArraySizeException e)
		{
		   System.out.println("please enter a positive array size");
		}
	
	catch(ArrayIndexOutOfBoundsException e)
	 {
	   System.out.println("please enter a vaild position");
	 }
	
	catch (InputMismatchException z) 
	{
		System.out.println("input mismatch exception.");
	}
	catch(Exception e)
	 {
	   System.out.println("some problem arised");
	   e.printStackTrace();
	 }
	
   finally 
   {
	  System.out.println("connection is terminaed");	
   }

  }
}

