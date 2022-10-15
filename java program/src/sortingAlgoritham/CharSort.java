package sortingAlgoritham;

public class CharSort {
	public static void main(String args[])
	{
		char a []= {'A','B','D','C','A'};
	char temp;
	System.out.println("char in sorted order:");
	
	for (int j = 0; j < a.length; j++) {
   	   for (int i = j + 1; i < a.length; i++) {
		
		if (a[i]>(a[j])) {
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
	   }
	   System.out.println(a[j]);
	}
   


}}
