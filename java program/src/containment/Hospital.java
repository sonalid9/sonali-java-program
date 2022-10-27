package containment;
class Hospital
{

private String hospitalName;
private int  floor;
private int  kebinNum;
Doctor d1;


public String  getHospitalName()
{
	 return hospitalName;
}
public void setHospitalName (String hn)
{
	hospitalName=hn;
}

public int   getFloor()
{
	 return floor;
}
public void setFloor(int f)
{
	floor =f;
}
public int   getKebinNum()
{
	 return kebinNum;
}
public void setKebinNum(int n)
{
	kebinNum =n;
}
public void setD1(Doctor d)
{
	d1=d; 
}




public String toString()
	{
		return  "The hospital name:-"+hospitalName+"\nThe Floor is:-"+floor+ "\nThe kebin num:-"+kebinNum+ "\n the Hospital has"+d1;
	}

}

