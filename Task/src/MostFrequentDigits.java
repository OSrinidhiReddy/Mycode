
import java.util.*;

public class MostFrequentDigits
{
 public static void main(String[] args) 
 {
	 int[]arr = new int[] {24,32,46,45,21};
	 MostFrequentDigits mfd=new MostFrequentDigits();
     //storting the o/p in mostfreq
	int[]MostFreq = mfd.mostFrequentDigits(arr);
	System.out.println(Arrays.toString(MostFreq));
	
 }
 //return z value to this method
 int[] mostFrequentDigits(int[]y)
 {    //i/p is given to ar
	 int[]ar=y;
	//array to string
	String st1 = Arrays.toString(ar); 
	
	System.out.println(st1);
	
	//creating empty list
    List<Integer> a = new ArrayList<Integer>();
	      
	for (int i = 0; i < st1.length(); i++) 
	{       //whether a specified character is a digit or not
		if (Character.isDigit(st1.charAt(i))) 
		{       
			//charat return ascii value include of that we r asking for NV
				a.add(Character.getNumericValue(st1.charAt(i)));
				
		}
	}	 
	//creating empty set
	Set<Integer> set = new HashSet<Integer>();
	 for (int i = 0; i < a.size(); i++) 
	 {
	     for (int j = i + 1 ; j < a.size(); j++) 
	     {
	    	 //compare every single digit with full list
	          if (a.get(i).equals(a.get(j))) 
	          {
	        	  //adding to set with sorted o/p n no dupli
	        	  set.add(a.get(i));
	          }
	     }
	 }
	 //creating empty array list
	    int[] z = new int[set.size()];
	    int j = 0;
	    for (Integer i: set) //checks int value or not
	    {    	
	       z[j++] = i.intValue();
	    }		
		return z;
	}
  }
