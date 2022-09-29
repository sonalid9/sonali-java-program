package BankProgram;

public class FDAccount {
	
	int accountNo;
	float balance;
	static long cnt=89754;
	int accNo;
	String Acholdname;
	static double intrestRate;
	
	static 
	{
		int a=12;
		System.out.println(" is static block:"  +a);
		String name;
		name="sonali";
		
		System.out.println("is second block:" +name); 
		
	}
	
	
	   public FDAccount( long accNo,float bal,String n)
	{
		accountNo=(int) accNo;
		balance= bal;
		Acholdname=n;
		accNo=cnt++;
	}
	   public static void changeIntrest(double i)
	   {
		   intrestRate=i;
	   }
	public   void showAccount()
	{
		System.out.println("account number is :" +accountNo);
		System.out.println("account balance is :" +balance);

		System.out.println("account holder  number is :" +Acholdname);

		
	}
	
	public static void main(String args[]) {
	

			
		FDAccount f=new FDAccount(12,24.0000f,"sonali");
		f.showAccount();
		
		
			}
}


