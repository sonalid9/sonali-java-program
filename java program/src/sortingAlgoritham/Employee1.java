package sortingAlgoritham;

public class Employee1 {

 void  dendingSalary( Employee[]rec)
{
	for( int i=0;i<rec.length-1;i++)
	{
		for(int j=0;j<rec.length-1-i;j++)
		{
			if(rec[j].salary<rec[j+1].salary)
			{
			Employee  temp=rec[j];
			rec[j]=rec[j+1];
			rec[j+1]=temp;
			//System.out.println(rec[i]+" ");
			}		
		}
		
	}
	System.out.println("\n The Desending order of salary is"+rec);
}

//Sallary with in a Ascending order 
void  AssendingSalary( Employee[]rec)
{
	for( int i=0;i<rec.length-1;i++)
	{
		for(int j=0;j<rec.length-1-i;j++)
		{
			if(rec[j].salary>rec[j+1].salary)
			{
			Employee  temp=rec[j];
			rec[j]=rec[j+1];
			rec[j+1]=temp;
			//System.out.println(rec[i]+" ");
			}		
		}
		
	}
	System.out.println("The Assending order of salary is"+rec);
}

int max=Integer.MIN_VALUE;
public void greaterSalary(Employee[]rec)
{

	for(int i=0;i<rec.length;i++)
	{
		if( rec[i].salary>max)
		
			System.out.println(rec);
			
		
	
			
	     
		System.out.println(max+" ");
	}

	
}
//Show employee salary who is above 50 thousand
public void showEmpRec(Employee[]rec)
{
	for(int i=0;i<rec.length;i++)
	{
		if(rec[i].salary>50000)
		{
			System.out.println(rec[i]+" ");
			
		}	
	}

}

public static void main (String []args)
{
	Employee records[]= new Employee[5];
	records[0]=new Employee("priya",211,34993.0f);
     records[1]=new Employee("sona",212,64993.0f);
 	

	records[2]=new Employee("puja",213,54993.0f);


	records[3]=new Employee("Nikita",214,164993.0f);
	

	records[4]=new Employee("Saurbhi",215,434993.0f);


	
	Employee1 d=new Employee1();
	d.showEmpRec(records);
	//d.greaterSalary(records);
	//d.AssendingSalary(records);
	//d.dendingSalary(records);
}



}
