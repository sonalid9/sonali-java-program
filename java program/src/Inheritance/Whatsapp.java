package Inheritance;

public class Whatsapp  extends MsgService{
	private  String userName;
	private long mobileNumber;
	Whatsapp()
	{
		System.out.println("this is default constrctor");
	}
	Whatsapp(String username,long mobileNumber)
	{
		super("groupmsg","50");
		System.out.println("this is parametrized");
	}
	
	public void ShowInfo()
	{
		System.out.println("the username:"  +userName);
		
		System.out.println("the MobileNumber:"  +mobileNumber);
	}
	





}
