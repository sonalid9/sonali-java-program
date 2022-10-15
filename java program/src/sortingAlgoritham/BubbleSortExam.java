package sortingAlgoritham;

import java.util.Arrays;

public class BubbleSortExam {
//ascending order 
public void bubbleSort(int a[])
{

	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length-i-1;j++)
		{
			if(a[j]>a[j+1])
			{   
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
  System.out.println(Arrays.toString(a));
}
public static void main(String [] args)
{ 
	int a[]= {1,3,2,6,7,4};
	
	BubbleSortExam b=new BubbleSortExam();
	System.out.println("after swappning");
	b.bubbleSort(a);
	
}}