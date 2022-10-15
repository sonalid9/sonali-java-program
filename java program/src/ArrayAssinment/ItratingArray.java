package ArrayAssinment;

import java.util.Arrays;

public class ItratingArray {

	
	public static void main(String args[])
	{

int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
int[] b= new int[10];     

System.out.println("Source Array : "+Arrays.toString(a));     

for(int i=0; i < a.length; i++) {
 b[i] = a[i];
}
System.out.println("New Array: "+Arrays.toString(b));
}
}

