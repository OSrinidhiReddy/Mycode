//user defined exception and try catch ladder

import java.util.Scanner;

class WrongPasswordException extends Exception
{
	public String getMessage()
	{
		return "entered credentials are invalid";
	}
}
class ATM
{
	int acc_num = 222;
	int password = 333;
	int an;
	int pw;
	
  void acceptInput()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter the acc_num");
	  an=scan.nextInt();
	  System.out.println("enter the password");
	  pw=scan.nextInt(); 
  }
  void verify() throws Exception 
  {  
	if(acc_num == an && password == pw)
	{
		System.out.println("collect the money");
	}
	else
	{
		WrongPasswordException wpe= new WrongPasswordException();
		System.out.println(wpe.getMessage());
		throw wpe;
	}
   }
 } 

class Bank
{
	ATM atm=new ATM();
	void initiate()
	{
		try
		{
			atm.acceptInput();
			atm.verify();
		}
		catch(Exception a)
		{
			try
			{
				atm.acceptInput();
				atm.verify();
			}
			catch (Exception e)
			{
				System.exit(0);
			}
		}
	}
}

public class Task7 
{
	public static void main(String[] args)
	{
	Bank b= new Bank();
	b.initiate();
	}
}