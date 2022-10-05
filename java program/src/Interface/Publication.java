package Interface;

public class Publication {


	
		public static void main(String[] args) {
		 // TODO Auto-generated method stub
			Book b = new Book();
			b.Writting("java", 200);
			
			NewsPaper n = new NewsPaper();
			n.Writting("css", 100);
			n.readding("BACK");
			
			Book b1= new ComicBook();
			b1.Writting("operating System", 500);
		}
	}