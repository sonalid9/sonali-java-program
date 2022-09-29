import java.util.Scanner;

public class ScannerAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum;
	
		int a;
		int b;
		
		System.out.println("Enter first no");
		a=sc.nextInt();
		System.out.println("Enter second no=");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Addition="+sum);
		
		

	}

}
