package Inheritance;

public class AudioMsg extends MsgService {

	private  String userName;
	private long mobileNumber;
	AudioMsg()
	{
		System.out.println("\nthis is default audiomsg");
	}
	AudioMsg(String username,long mobilenumber)
	{
		System.out.println("this is parametrized");
	}
	
	public void ShowInfo2(String userName,long mobileNumber)
	{
		System.out.println("the username:"  +userName);
		
		System.out.println("the MobileNumber:"  +userName);
	}
	
}
