package Interface;

interface Write
{
	


	public default void Writting(String font,int size) 
	{
		System.out.println("Font of the book is "+font);
		System.out.println("Size of the book is "+size+ " pages");
	}

	
}