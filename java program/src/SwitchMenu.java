import java.util.Scanner;

public class SwitchMenu {

	public static void main(String[] args) {
		int o,totalbill,q;
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("\n\n1 vadapav   10/-  \n2 misal    20/-   \n3 pizza   30/-");
		
		System.out.println("what you want to order?");
		o=sc.nextInt();

		System.out.println("what is quantity ?");
		

	
		q=sc.nextInt();
		switch(o)
		{

		case 1:
			totalbill=q*10;
			System.out.println("you order vadpav totalbill is:"+totalbill);
			break;
			case 2:
				totalbill=q*20;
				System.out.println("you order misal  totalbill is:"+totalbill);
				break;
			case 3:
				totalbill=q*30;
				System.out.println("you order pizza totalbill is:"+totalbill);
				break;
				default:
					System.out.println("sorry we have not that menu");
		}
}
		}
	
		
		
	
