import java.util.Scanner;



public class GrossSalary {

	public static void main(String[] args) {
	  int basicsalary;
	  float hra;
	  float da;
	  float totalsalary;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic salary");
		basicsalary=sc.nextInt();
		if(basicsalary>=0 && basicsalary<=10000)
		{
		hra=basicsalary*20/100;
		da=basicsalary*80/100;
		totalsalary=basicsalary+hra+da;
		System.out.println("total salary is :"+ totalsalary);
		System.out.println("house rent allowance :"+ hra);
		System.out.println(" dare allowance :"+ da);


		}
		else if(basicsalary>=10001 && basicsalary<=20000)
		{
			hra=basicsalary*25/100;
			da=basicsalary*90/100;
			totalsalary=basicsalary+hra+da;
			System.out.println("total salary is :"+ totalsalary);
			System.out.println("house rent allowance :"+ hra);
			System.out.println(" dare allowance :"+ da);


		}
		else 
		{
			hra=basicsalary*30/100;
			da=basicsalary*95/100;
			totalsalary=basicsalary+hra+da;
	
			System.out.println("total salary is :"+ totalsalary);
			System.out.println("house rent allowance :"+ hra);
			System.out.println(" dare allowance :"+ da);


		}


		

	}

}

