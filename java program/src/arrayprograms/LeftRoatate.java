package arrayprograms;

import java.util.Arrays;

public class LeftRoatate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		int n=a.length;
		
		System.out.println("Original Array : \n");
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++) 
		{
			System.out.print(" "+a[i]);
		}
	
		
		for(int i=0;i<n;i++) 
		{
			int j,first;
			first=a[0];
			
			for(j=0;j<a.length-1;j++) 
			{
				a[j]=a[j+1];
			}
			a[j]=first;
		
		}
		System.out.println();
		
		System.out.println("Array After Left Rotation: \n");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(" "+a[i]);
		}
		

	}

}
