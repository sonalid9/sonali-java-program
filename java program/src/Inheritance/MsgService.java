package Inheritance;

public class MsgService {
	private  String msgtype;
	private String msgLength;
	private long mobileNumber;
	MsgService()
	{
		System.out.println("\nthis is first default");
	}
	MsgService(String type,String  length)
	{
		System.out.println(("this is prametrized"));
		}
	public void showDetails1(String msgtype,String msgLength)
	{
		System.out.println("the msgtype:"  +msgtype);
		System.out.println("the msgLength:"  +msgLength);	



		
	}
	


}




