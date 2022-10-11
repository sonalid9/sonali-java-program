package arrayprograms;

import java.util.Arrays;
//right
public class Shiftinarray {
	 public static void main(String args[])
	  { 
	
		int [] a = {2,3,3,4,5};
		int n=a.length;
		System.out.println("Original Array :" );
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++) 
		{
			System.out.print(" "+a[i]);
		}
		for(int i=0;i<n;i++) 
		{
			int j,last;
			last=a[a.length-1];
			
			for(j=a.length-1;j>0;j--) 
			{
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println();
		
		System.out.println("Array After Rotation: ");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(" "+a[i]);
		}
	  
  }
}
