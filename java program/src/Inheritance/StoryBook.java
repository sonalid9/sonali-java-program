package Inheritance;

public class StoryBook extends Poembook {

	private String BookName;
	private String BookAuthor;
	private  int BookPrice;
	StoryBook()
	{}
	StoryBook(String BookName,String BookAuthor,int BookPrice)
	{
		
	super("mahabhart","sonal",500);
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
 void readbook( String name)
 {
	 System.out.println("i am reading book");
 }
public static void main(String args[])
{
	
	
	StoryBook S=new StoryBook("abs","priya",50);
	S.Show();
	S.show1();
	S.showInfo();
	
	


	
}}
