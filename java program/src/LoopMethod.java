import java.util.Scanner;

public class LoopMethod {
	
	public void divisible()
	{
	
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter no:");
			n=sc.nextInt();
			String result=n%5==0 ?"yes number is divisible by 5" :"no is diviable by 5";
			System.out.println(result);

		}

	public static void main(String[] args) {
		LoopMethod a=new LoopMethod();
		a.divisible();

	}

}
