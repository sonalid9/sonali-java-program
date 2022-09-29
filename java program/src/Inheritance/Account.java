package Inheritance;

public class Account {

	int  AccontNo;
	int balance ;
	String AccountHolder;

Account()
{}
Account(int AccountNo,int balance, String AccountHolder)
{
	this.AccontNo= AccountNo;
	this.balance=balance;
	this.AccountHolder=AccountHolder;
	
}

public void  ShowDetails()
{
	
	System.out.println(" Account:" +AccontNo);
	System.out.println(" balance:" + balance);
	System.out.println(" AccountHolder:" +AccountHolder );


	
}
}




	



	