import java.util.Scanner;

public class ScannerEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int num1=sc.nextInt();
		a=num1%2;
		System.out.println(a);
		switch(num1%2)
		{
		case 0:
			System.out.println(num1 +  " is an even number ");
			break;
		case 1:
			System.out.println(num1+  "  is an odd number");
		}

	}





	}


