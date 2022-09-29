import java.util.Scanner;

public class Alphabetascci {

	public static void main(String[] args) {
		char upper,lower;
		int ascii;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  upper charcter");
	upper=sc.next().charAt(0);
	ascii=upper;
	ascii=ascii+32;
	lower=(char)ascii;
	System.out.println("\nenter charcter in upper="+lower);

	}

}
