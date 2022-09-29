import java.util.Scanner;

class Factors1
{
	
	   public void run() {
		  int n,i;
		  Scanner sc = new Scanner(System.in);
		     
		   System.out.println("Enter the number : ");
		         n = sc.nextInt();
		         System.out.println("The factors of " + n + " are: ");
		         for (i = 1; i <= n; ++i) {
		            if (n % i == 0) {
		               System.out.println(i + " ");
		            }
		         }
		      }
	   public void run1()
	   {
		   
	   int number, i;
	         Scanner sc = new Scanner(System.in);
	      
	         System.out.println("Enter the number : ");
	         number = sc.nextInt();
	         System.out.println("The factors of " + number + " are: ");
	         for (i = 1; i <= number; ++i) {
	            if (number % i == 0) {
	               System.out.println(i + " ");
	            }
	         }
	      }
	   public static void main(String[]args)
	   {
		   Factors1 a=new Factors1();
		   a.run();
	   
		   Factors1 b=new Factors1();
		   b.run();
	   }
}





