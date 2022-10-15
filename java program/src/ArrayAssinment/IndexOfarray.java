package ArrayAssinment;

public class IndexOfarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,7};
		int element=3;
		int index=4;
		int i=0;
		while(i<a.length)
		{
			if(a[i]==element)
			{
				index=i;
			}
			i++;
		}
		
    System.out.println("index of  "  +element  +  " is  "   +   index);
	}

}
