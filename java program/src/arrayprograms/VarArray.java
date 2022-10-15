package arrayprograms;

public class VarArray {

	static void add(int str,  int... a)
    {
        System.out.println("String: " + str);
        System.out.println("Number of arguments is: "
                           + a.length);
        int  sum=0;

      
        for (int i=1;i<a.length;i++)
        {
         sum=a[i];
        
         
        }
       System.out.println(sum);
    }
 
    public static void main(String args[])
    {
        
        add( 100, 200);
        add( 1, 2, 3, 4, 5);
        add(2);
    }
}