package TWoDimentionalArray;

public class SimpleArray {

	public void jaggaed(int a[] [])
	{
		
		 for (int i = 0; i < a.length; i++)
		        {
		            for (int j = 0; j<a[i].length; j++)
		            {
		    
		        System.out.println("array[" + i + "][" + j + "] = "  + a[i][j]);
		            }}}
		    

public static void main(String[] args) {
	{
        int[][] a = { { 1, 2 }, { 3, 4 ,5} };

		SimpleArray s = new SimpleArray();
		s.jaggaed(a);
	}
}}
