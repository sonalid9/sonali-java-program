package arrayprograms;

import java.util.Scanner;
public class OccranceOfArry
{

public void occuranceOfNumber() 
{
	int [] array = {1,2,3,4,5,1,2,3,4,5};
	
	for(int i=0;i<array.length-1;i++) 
	{
		if(array[i]==-999)
			continue;
		int cnt=1;
		for(int j=i+1;j<array.length;j++) 
		{
			if(array[i]==array[j]) 
			{
				cnt++;
				array[j]=-999;
			}
		}
		System.out.println(array[i]+ " occurs "+cnt + " Times");
	}
}

	public static void main(String args[])
	{
		 int a[]=new int[] {3,5,5,6,7,6};
		 OccranceOfArry c=new OccranceOfArry();
		 c.occuranceOfNumber();
	}
	}