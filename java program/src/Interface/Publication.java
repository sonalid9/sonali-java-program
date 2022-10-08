package Interface;

public class Publication {


	
		public static void main(String[] args) {
		 // TODO Auto-generated method stub
			
			
			NewsPaper n = new NewsPaper();
			n.Writting("css", 100);
			n.readding("BACK");
			n.publishNews("lokmat");
			
			ComicBook b1= new ComicBook();
			
			b1.readding("java");
		}
	}