import java.util.Scanner;

public class Lpattern 
{
	public void pattern()
	{
		
	Scanner sc = new Scanner(System.in); 
    System.out.println("Enter number of rows: ");
    int rows = sc.nextInt();
    for (int i= rows; i>= 1; i--)
    {
    for (int j=rows; j>i;j--)
    {
    System.out.print(" ");
    }
    for (int k=1;k<=i;k++)
    {
    System.out.print("*");
    }
    System.out.println("");
    }
    sc.close();
    }
    

	public static void main(String[] args) {
		Lpattern a=new Lpattern();
		a.pattern();
	

	}

}
