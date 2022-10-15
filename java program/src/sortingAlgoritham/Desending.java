package sortingAlgoritham;

import java.util.Arrays;

public class Desending {
	public void Swaping(int a[])
	   {
		   int n=a.length;
		   int temp=0;
		     
	       
	        for (int i = 0; i < a.length; i++) 
	        {     
	            for (int j = i+1; j < a.length; j++) 
	            {     
	               if(a[i] < a[j]) 
	               {    
	                   temp = a[i];    
	                   a[i] = a[j];    
	                   a[j] = temp;    
	               }     
	            }     
	        } 
	   }

	   public static void main(String [] args)
	   {
		   int a[]= {2,7,6,4,1,-1,6,9};
		   Desending   b= new Desending();
		   System.out.println("Array Before Sorting :");
		   System.out.println(Arrays.toString(a));
		   b.Swaping(a); 
		   System.out.println("Array After Sorting :");
		   System.out.println(Arrays.toString(a));
		   
		   
	   }
}