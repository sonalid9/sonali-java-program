package Interface;

public class UseofFunctionalInterface {

	private static String prize_;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadBook r=(String s,int prize)->
		System.out.println("read the book:-"+s);
		System.out.println("book price:-"+prize_);
		r.readingbook("java", 88);
		
	}
}
		
		