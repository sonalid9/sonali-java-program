package Inheritance;

public class Hierarchical {
	private  String BankName;
	private String AccountType;
	private int Balance;
	private long mobileNumber;
	Hierarchical()
	{}
	Hierarchical(String BankName,String  AccountType,int Balance,long mobileNumber)
	{
		this.BankName=BankName;
		this.AccountType=AccountType;
		this.Balance=Balance;
		this.mobileNumber=mobileNumber;
	}
	
	public void showDetails1()
	{
		System.out.println("the bankname:"  +BankName);
		System.out.println("the bank Accounttype:"  +AccountType);
		System.out.println("the Balance:"  +Balance);
		System.out.println("the MobileNumber:"  +mobileNumber);



		
	}
	


}

