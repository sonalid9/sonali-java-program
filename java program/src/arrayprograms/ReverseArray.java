package arrayprograms;

import java.util.Scanner;

public class ReverseArray {

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
    System.out.println("reverse  of array is:"+a.length);
    
    for (int i=0;i<a.length;i--)
    {
    	System.out.println(a[i]+" ");
    }
	}

}
