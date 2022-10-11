package arrayprograms;

import java.util.Scanner;
public class EnhanceForloop
{

public static void main(String args[])
{
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array:");
	size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the array element:");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("length of array is:"+a.length);
	System.out.println("square of each element:");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]*a[i]+"");
	}
		System.out.println(" for each loop");
		for(int sq:a)
		{
			System.out.println(sq*sq);
		}
	

	}

}
