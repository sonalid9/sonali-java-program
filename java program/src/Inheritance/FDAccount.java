package Inheritance;

public class FDAccount extends Account
{
int balance;
int AccountNO;
String AccountHolderName;

FDAccount()
{}

FDAccount(int balance,int AccountNo,String AccountHolderName )
{
	super(12345,50000,"sonali");

	
	this.balance=balance;
	this.AccontNo=AccontNo;
	this.AccountHolderName=AccountHolderName;
}
public void Show()
{
	System.out.println("The account balance" +balance);
	System.out.println("The account Number:"+AccontNo);
	System.out.println("The accountHolderName:"  +AccountHolderName);

	

	
}


}