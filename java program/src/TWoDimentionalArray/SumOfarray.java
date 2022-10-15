package TWoDimentionalArray;

import java.util.Scanner;

public class SumOfarray 
{
	public void tdArray() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int row = sc.nextInt();
		System.out.print("Enter the size of the array : ");
		int colm = sc.nextInt();
		int sum=0;
		int[][] array = new int[row][colm];
		
		  for(int i=0;i<row;i++) 
		{
			for(int j=0;j<colm;j++) 
			{
				System.out.print("Enter the elements of array : ");
				array[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("\nOriginal array : ");
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<colm;j++) 
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nAdition of Rows : ");
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<colm;j++) 
			{
				sum=sum+array[i][j];
			}
			System.out.println("sum of "+ i +" row is "+sum);
		}
		
		System.out.println("\nMaximum and Minimum in array : ");
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<colm;j++) 
			{
				if(array[i][j] > max) 
				{
					max=array[i][j];
				}
			}
			System.out.println("maximum in "+ i + " row is "+ max);
		}
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<colm;j++) 
			{
				if(array[i][j] < min ) 
				{
					min=array[i][j];
				}
			}
			System.out.println("minimum in "+ i + " row is "+ min);
		}}}