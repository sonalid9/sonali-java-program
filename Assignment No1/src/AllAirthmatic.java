import java.util.Scanner;

public class AllAirthmatic {

	public static void main(String[] args) {

    int num1, num2;
    int sum, sub, mult, mod;
    float div;
    Scanner op=new Scanner(System.in); 
    
   
    System.out.print("Enter first number: ");
    num1=op.nextInt();
    System.out.print("Enter second number:");
    num2=op.nextInt();

    /*
     * Perform all arithmetic operations
     */ 
    sum = num1 + num2;
    sub = num1 - num2;
    mult = num1 * num2;
    div = (float)num1 / num2;
    mod = num1 % num2;

    /*
     * Print result of all arithmetic operations
     */
    System.out.println("SUM = "+sum);
    System.out.println("DIFFERENCE = "+sub);
    System.out.println("PRODUCT = "+mult);
    System.out.println("QUOTIENT = "+div);
    System.out.println("MODULUS = "+mod);
    }


}
