import java.util.Scanner;

public class krushanmurtyNo {

	// method to Check the Krishnamurthy number
	   public static boolean isKrishnamurthy(int number){

	      // declare variables
	      int sum = 0, lastDigit = 0;
	      int tempNum = number;

	      // traverse through all digits of number
	      while(tempNum != 0) {
	          lastDigit = tempNum % 10;
	          sum += factorial(lastDigit);
	          tempNum /= 10;
	      }

	      // compare sum and number
	      if(sum == number)
	          return true; 
	      return false; 
	   }

	   // method to calculate factorial of an integer
	   public static long factorial(int n) {
	      long fact = 1;
	      for(int i=1; i<=n; i++) {
	          fact *= i;
	      }
	      return fact;
	   }

	   // main method
	   public static void main(String[] args) {

	      // declare variables
	      int number = 0;
	      boolean result = false;

	      //create Scanner class object to take input
	      Scanner scan = new Scanner(System.in);

	      // take input from end-user
	      System.out.print("Enter an integer number::");
	      number = scan.nextInt();

	      // check number is Krishnamurthy number
	      result = isKrishnamurthy(number);
	      if(result)
	          System.out.println(number +
	              " is a Krishnamurthy number.");
	      else
	          System.out.println(number +
	              " is not a Krishnamurthy number.");

	      // close Scanner class object
	      scan.close();
	   }
	}