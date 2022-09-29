package OverRidan;

public class TextBook extends Book{

	private String BookName;
	private String BookAuthor;
	private  int BookPrice;
	TextBook()
	{}
	TextBook(String BookName,String BookAuthor,int BookPrice)
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
 void readbook( String s)
 {
	 super.readbook("ramyan");
	 System.out.println("i am reading  textbook:" +s  );
	 
 }
}