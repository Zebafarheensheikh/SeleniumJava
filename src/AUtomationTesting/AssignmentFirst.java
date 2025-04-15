package AUtomationTesting;

import java.util.ArrayList;

public class AssignmentFirst {

	public static void main (String[] args) {
	    int[] numbers= {3,5,7,9,1};
	    int Total =0;
	    for (int i=0;i<5;i++)
	    {
	       if (i==0)  
	       {
	           System.out.println(numbers[i]);
	       }
	       else if (i==4)
	       {
	           System.out.println(numbers[i]);
	       }
	       else{
	           System.out.println(" ");
	       }
	    }
	    for(int i=0;i<numbers.length;i++)
	    {
	    	int[] Temp = new int[5];
	    	
	        Temp[i]= numbers[numbers.length-1-i]; 
	        System.out.println(Temp[i]);
	    }
	    
	    for(int i=0;i<numbers.length;i++)
	    {
	    	
	    	Total=Total+numbers[i];
	    	
	    }
	    System.out.println("sum of total numbers of array " + Total);
	    
	    ArrayList<String> AL = new ArrayList<String>();
	    AL.add("Zeba");
	    AL.add("Sheikh");
	    AL.add("Array");
	    AL.add("List");
	    AL.add("SCript");
	    
	    for(int i=0;i<AL.size();i++)
	    {
	    	System.out.println(AL.get(i));
	    }
	    //enhanced for loop
	    for(String variable_1:AL)
	    {
	    	System.out.println(variable_1);
	    }
	    
	    }

	}