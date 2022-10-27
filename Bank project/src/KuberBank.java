import java.util.Scanner;

public class KuberBank {
	public int isUser(AccountHolder a[],Admin b[])
	{
		int i=-9;
		Admin ad = new Admin();
		AccountHolder r = new AccountHolder();
		Scanner sc = new Scanner(System.in);
		String user = "";
		System.out.println("Enter your Acountid ");
		int id = sc.nextInt();
		System.out.println("Enter your passwod ");
		long p = sc.nextLong();
		int l = r.isAccountHolder(id, p, a);
		
		if(l>=0 && l<a.length)
		{
			i=l;
		}
		       
		         
		if ((ad.isAdmin(id, p, b)==true))
		{
			user = "isadmin";
		}
		
		return i;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Admin a = new Admin();
		KuberBank k = new KuberBank ();
		AccountHolder ah = new AccountHolder();
	  AccountHolder data []= new AccountHolder[2];
	  data[0]= new AccountHolder(101,30000f,"Rajesh",875676L);
	  data[1]= new AccountHolder(12,3000f,"Jay",7685554L);
	  
	  Admin ad[] = new Admin[1];
	  ad[0]= new Admin(1234,98764l);
	  
	  
	  System.out.println(".......WELCOME TO KUBER BANK......");
	  System.out.println("What would you like to do \n 1.Login 2.Create Account");
	  int b = sc.nextInt();
	  switch(b)
	  {
	  case 1:
	  {
		  int x =k.isUser(data, ad); 
		  if(x>=0 && x<data.length)
		  {
			 data[x].userService();
			 
		  }
//		  else if(s=="isadmin")
//		  {
//			  System.out.println("Admin section");
//		  }
		  
		 break;
	  }
	  case 2:
	  {
		  
		  
	  }
	  
	  }
	    
	  
	  

	  }

}
	



