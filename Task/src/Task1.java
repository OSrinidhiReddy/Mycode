public class Task1 
	{
	   public void rw(String str)
	   {
		String[] w = str.split(" ");
		
		//reverse empty string
		String rs = "";
		//length variable is for array [0-n]index
		for (int i = 0; i < w.length; i++)
	        {
	           String w1 = w[i]; 
	           String rw1 = "";
	           //return the num of char in string
	           for (int j = w1.length()-1; j>= 0; j--) 
		   {
			// The charAt() function returns the character at the given position in a string
			rw1 = rw1+ w1.charAt(j);
		   }
		   rs = rs + rw1 + " ";
		}
		System.out.println(str);
		System.out.println(rs);
	   }
	   public static void main(String[] args) 
	   {
		Task1 t1 = new Task1();
		t1.rw("my name is java");
	   }
	}

