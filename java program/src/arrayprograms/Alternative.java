package arrayprograms;

import java.util.Scanner;

public class Alternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size :");
	    size=sc.nextInt();
	    int a[]=new int[size];
	    System.out.println("enter the array element");
	    for(int i=0;i<size;i++)
	    {
	    	a[i]=sc.nextInt();
	    	
	    }
	    System.out.println("length of array is:"+a.length);
	    System.out.println("your alternative array is:");
	    for (int i=0;i<a.length;i=i+2)
	    {
	    	System.out.println(a[i]+" ");
	    }



	}

}
