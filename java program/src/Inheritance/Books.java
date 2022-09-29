package Inheritance;

public class Books {
 private String BookName;
private String BookAuthor;
private  int BookPrice;
Books(){}
Books(String BookName ,String BookAuthor,int BookPrice  )
{
	this.BookName=BookName;
	this.BookAuthor=BookAuthor;
	this.BookPrice=BookPrice;
}

public void  Show( )
{
	System.out.println( "The book name:" + BookName);
	System.out.println( "The book Author name:" +BookAuthor );
	System.out.println( "The book Price:" +BookPrice );

	

	
}
}