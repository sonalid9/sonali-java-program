package ArrayAssinment;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
	
    int size;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size :");
    size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("enter the array element");
    for(int i=0;i<a.length;i++)
    {
    	a[i]=sc.nextInt();
    	System.out.println(a[i]);
    }
    System.out.println("reverse  of array is:"+a.length);
    
    for(int i=a.length-1;i>=0;i--)

    
    	System.out.println(a[i]+" ");
    }
	}

