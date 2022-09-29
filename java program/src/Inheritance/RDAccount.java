package Inheritance;

public class RDAccount extends Hierarchical {
	private  String BankName;
	private String AccountType;
	private int Balance;
	private long mobileNumber;
	RDAccount()
	{}
	RDAccount(String BankName,String  AccountType,int Balance,long mobileNumber)
	{
		this.BankName=BankName;
		this.AccountType=AccountType;
		this.Balance=Balance;
		this.mobileNumber=mobileNumber;
	}
	
	public void showDetails3()
	{
		System.out.println("the bankname:"  +BankName);
		System.out.println("the bank Accounttype:"  +AccountType);
		System.out.println("the Balance:"  +Balance);
		System.out.println("the MobileNumber:"  +mobileNumber);

	}
	public static void main(String args[])
	{
		FdAccount1 R=new FdAccount1("icic","saving",8000,6755433l);
		R.showDetails1();
		R.ShowInfo();
		
		
		RDAccount S=new RDAccount("DCC","current",60000,23456266l);
		S.showDetails3();
    
   
		
	}

	

}
