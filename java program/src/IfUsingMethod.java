import java.util.Scanner;

public class IfUsingMethod {
	public void multi() {
		int x=100;
		int x1=5;
		System.out.println("all Arithmatic operation");
	System.out.println("Multiplication:" +x*x1);
	System.out.println("Addition:" +( x+x1));
	System.out.println("substraction:"  +  (x-x1));
	System.out.println("Dividation:"   + x/x1);
	System.out.println("mod:"   +x%x1);

}
	
	
	
	public void run() 
	{
	      int my_input, i;
	      System.out.println("Required packages have been imported");
	      Scanner my_scanner = new Scanner(System.in);
	      System.out.println("A reader object has been defined ");
	      System.out.print("Enter the number : ");
	      my_input = my_scanner.nextInt();
	      System.out.print("The factors of " + my_input + " are: ");
	      for (i = 1; i <= my_input; ++i) {
	         if (my_input % i == 0) {
	            System.out.print(i + " ");
	         }
	
	      }
	}
	
	
	
	public void run1()
	{
	
		      int my_input, i;
		      System.out.println("Required packages have been imported");
		      Scanner my_scanner = new Scanner(System.in);
		      System.out.println("A reader object has been defined ");
		      System.out.print("Enter the number : ");
		      my_input = my_scanner.nextInt();
		      System.out.print("The factors of " + my_input + " are: ");
		      for (i = 1; i <= my_input; ++i) {
		         if (my_input % i == 0) {
		            System.out.print(i + " ");
		         }
	}}
	
	
public static void main(String[] args) {
		
		IfUsingMethod a=new IfUsingMethod();
		a.multi();

		IfUsingMethod a1=new IfUsingMethod();
        a1.run();
		IfUsingMethod a2=new IfUsingMethod();
        a2.run1();

	}

}

