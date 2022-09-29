package OverRidan;

public class Book {



	private String BookName;
	private String BookAuthor;
	private  int BookPrice;
	Book()
	{}
	Book(String BookName,String BookAuthor,int BookPrice)
	{
		
		this.BookName=BookName;
		this.BookAuthor=BookAuthor;
		this.BookPrice=BookPrice;
	}

public void showInfo()
{ 
	System.out.println(" bookName:"  +BookName);
	System.out.println(" bookAuthor:"  +BookAuthor);
	System.out.println(" bookprice:"  +BookPrice);
}
 void readbook(String A )
 {
	 System.out.println("i am reading book :  " +A);
 }
}