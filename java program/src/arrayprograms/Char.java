package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc= new Scanner (System.in);
		System.out.println("what should be the array size:");
		size=sc.nextInt();
		char a []=new char[(int) size];
		System.out.println(Arrays.toString(a));
		System.out.println("enter char  array elements: ");
		for(float i=0;i<a.length;i++)
		{
			a[(int) i]=sc.next().charAt(0);
		}
		System.out.println("length of array is:"+a.length);
	
		System.out.println("array elements are...");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[(int) (i)]+" ");
		}
		





	}

}
