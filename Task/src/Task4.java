public class Task4
{
	public static void main(String[] args) 
	{
	      String s1= "i know java concepts";
	      String r = "";
	      
	      String[] sp1 = s1.split(" ");
	      for (int i = 0; i < sp1.length; i++) 
	      {
			System.out.print(sp1[i] + " ");
		  }	 
	      
	      System.out.println();

	      for (int a = 0; a < 3; a++)
	      {
	    	  for (int i = 0; i < sp1.length; i++) 
		      {     
		            for (int j = i+1; j < sp1.length; j++) 
		            {     
		            	if (sp1[i].charAt(0) > sp1[i+1].charAt(0))
		               {    
		            		String temp = sp1[i];    
		                   sp1[i] = sp1[j];    
		                   sp1[j] = temp;    
		               }     
		            }     
		        }
		  }    
	      for (int i = 0; i < sp1.length; i++) 
	      {
			System.out.print(sp1[i] + " ");
		  }	    
	   }
}