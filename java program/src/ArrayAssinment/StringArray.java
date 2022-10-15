package ArrayAssinment;

import java.util.Scanner;

public class StringArray {
	
	public static void main(String[] args) {

		{
			int size;
			Scanner sc= new Scanner (System.in);
			System.out.println("enter the size of array:");
			size=sc.nextInt();
		
		   char a []=new char[(int) size];

	       System.out.println("enter the  string element");
	       for(int i=0;i<a.length;i++)
	       {
				a[(int) i]=sc.next().charAt(0);

	       System.out .println("array element");
	       }
			for(int i=0;i<a.length;i++)
			{
			System.out.println(a[i]);
				
			}
		}
		
	}}

		

