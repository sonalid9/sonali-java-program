package Interface;

interface Read
{
	void readding(String bookName);
}

class NewsPaper implements Read,Write
{
	public void Writting(String font,int size) 
	{
		System.out.println("Font of the News Peper is "+font);
		System.out.println("Size of the News Peper is "+size+ " pages");
	}
	public void readding(String bookName) 
	{
		System.out.println("The News Peper name is "+bookName);
	}
	public void publishNews() 
	{
		System.out.println("publishing the News");
	}
}

class ComicBook extends Book implements Read
{
	public void readding(String bookName) 
	{
		System.out.println("The Comic Book name is "+bookName);
	}
}
