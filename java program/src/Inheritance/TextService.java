package Inheritance;

public class TextService extends MsgService{
	
	private  String userName;
	private long mobileNumber;
	TextService()
	{
		System.out.println("\nthis is default 2 constructor");
	}
	TextService(String username,long mobilenumber)
	{
		
	}
	
	public void ShowText(String userName,long mobileNumber)
	{
		System.out.println("the username:"  +userName);
		
		System.out.println("the MobileNumber:"  +mobileNumber);
	}
	




}
