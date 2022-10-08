package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc= new Scanner (System.in);
		System.out.println("what should be the array size:");
		size=sc.nextInt();
		boolean  a []=new boolean[] {true,false,false,true};
		
		System.out.println(Arrays.toString(a));
		System.out.println("enter boolaen  array elements: ");
		for(int  i=0;i<a.length;i++)
		{
			a[(int) i]=sc.nextBoolean();
		}
		System.out.println("length of array is:"+a.length);
	
		System.out.println("array elements are...");
		for(int i=0;i<a.length;i++)
		{
	    	System.out.println(a[i]+" ");

		}
		



	}//
}
		
	
