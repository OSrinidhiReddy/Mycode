public class Task2
{
	public static void main(String[] args) 
	{
		revStr("my name is java");
	}

	public static  void revStr(String input) 
	{  
          //toCharArray() returns an Array of chars after converting a String into sequence of characters
		char[] ipArray = input.toCharArray();  
		char[] result = new char[ipArray.length]; 
        for (int i = 0; i < ipArray.length; i++)
		{
			if (ipArray[i] == ' ')
			{  
				result[i] = ' ';  
			}  
		}  

		int j = result.length - 1;  

		for (int i = 0; i < ipArray.length; i++)
		{  
			if (ipArray[i] != ' ') 
			{  
				if (result[j] == ' ') 
				{  
					j--;  
				}  
				result[j] = ipArray[i];  
				j--;  
			}  
		}  
		System.out.println("Given String -- "+input + "\n" +"revrse String-- "+ String.valueOf(result));  
	}  
}