package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

public static void main(String args[])
{
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner (System.in);
		System.out.println("what should be the array size:");
		float size=sc.nextFloat();
		float a []=new float [(int) size];
		System.out.println(Arrays.toString(a));
		System.out.println("enter 5 float array elements: ");
		for(float i=0;i<a.length;i++)
		{
			a[(int) i]=sc.nextFloat();
		}
		sc.close();
		System.out.println("array elements are...");
		for(float i=0;i<a.length;i++)
		{
			System.out.println(a[(int) (i)]+" ");
		}
		
	}


	}


