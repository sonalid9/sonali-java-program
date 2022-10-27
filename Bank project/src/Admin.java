
public class Admin {
	private int adminId;
	private long adminPassword;
	Admin(){};
	Admin(int id,long adpass)
	{
		adminId = id;
		adminPassword = adpass;
	}
	AccountHolder a= new AccountHolder();
	public int getAdminId()
	{
		return adminId;
	}
	public long getAdminPassword()
	{
		return adminPassword;
	}
	
	public void updateId(int id)
	{
		a.setAccId(id);
		
	}
	public void updateBal(float b)
	{
		a.setAccbal(b);
	}
	public void updateName(String n)
	{
		a.setAccName(n);
	}
	public void updatePass(long p)
	{
		a.setAccPass(p);
	}
	
	public boolean isAdmin(int id , long pass, Admin a[])
	{
		boolean is = false;
		for(Admin x : a)
		{
			if(x.getAdminId()==id && x.getAdminPassword()==pass)
			{
				is = true;
				break;
			}
		}
		
		return is;
	}


}
