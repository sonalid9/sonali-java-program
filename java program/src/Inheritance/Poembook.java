package Inheritance;

public class Poembook extends Books{
	private String PoemBookName;
	private String AutorNAme;
	private int Price;
	Poembook()
	{}
	Poembook(String  PoemBookName,String AutorNAme,int Price)
	{
		super("dasbhodh","RamdasSwami",500);

	
		this.PoemBookName=PoemBookName;
		this.AutorNAme=AutorNAme;
		this.Price=Price;
	}
	public void show1()
	{
		System.out.println("the poembook name:"  + PoemBookName);
		System.out.println("the Autor name:"  + AutorNAme);
		System.out.println("the book price:"  + Price);

		

		
	}
}
	
	