package arrayprograms;

import java.util.Scanner;

public class MaxNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int [size];
		
		System.out.println("Enter array elements  :");
		for(int i =0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int max =a[0];
		
		for(int i =1;i<a.length;i++)
		{
			if( a[i]>max)
				max=a[i];
		
			
			
		}
		System.out.println("the maximum array is:"+max);
	}}



	
