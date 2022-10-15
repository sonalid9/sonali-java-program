package ArrayAssinment;
import java.util.Arrays;
import java.util.Scanner;

public class IntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size :");
		size=sc.nextInt();
		int a[]=new int[size];

		System.out.println("enter the array:");
		for(int i=0;i<a.length;i++)
		{
		
			a[i]=sc.nextInt();
		
		System.out.println("the array lentgh is:"+a.length);
		
		}
		for(int i=0;i<a.length;i++)
		{
			
		
			System.out.println(  +a[i]);
		}
			}



	}


