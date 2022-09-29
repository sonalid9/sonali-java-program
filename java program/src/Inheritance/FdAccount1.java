package Inheritance;

public class FdAccount1 extends Hierarchical {
	private  String BankName;
	private String AccountType;
	private int Balance;
	private long mobileNumber;
	FdAccount1()
	{}
	FdAccount1(String BankName,String  AccountType,int Balance,long mobileNumber)
	{
		super("SBI","saving",40000,89752585l);
		this.BankName=BankName;
		this.AccountType=AccountType;
		this.Balance=Balance;
		this.mobileNumber=mobileNumber;
	}
	
	public void ShowInfo()
	{
		System.out.println("the bankname:"  +BankName);
		System.out.println("the bank Accounttype:"  +AccountType);
		System.out.println("the Balance:"  +Balance);
		System.out.println("the MobileNumber:"  +mobileNumber);
	}
	




}
	

