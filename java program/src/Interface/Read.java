package Interface;

interface Read
{
	void readding(String bookName);
	static void Distance(int a)
	{
		System.out.println("\n wanted distnace:="+a);
	}
	default String distanceFromsite(String x)
	{
		System.out.println("the safev distance from  sitev ="+x);
		return x;
	}
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
	public void publishNews (String s) 
	{
		System.out.println("pupublishNewsblishing the News:"+s);
	}
	
	}


class ComicBook extends NewsPaper implements Read
{
	public void readding(String bookName) 
	{
		System.out.println("The Comic Book name is "+bookName);
	}
}
