package com.constructoroverloading;

public class department {
	
	
	String Department_name;
	int  Department_id;
	int Department_workers;
static String orgname;

public department()
{
	Department_name="AWD Deparment";
	 Department_id=567;
	 Department_workers=67;
}

public department(String Department_name,int  Department_id,int Department_workers)
{
	this.Department_name=Department_name;
	this. Department_id=Department_id;
	this.Department_workers=Department_workers;
}
static 
{
	orgname="Department";
	
}
public void getdeparmentInfo()
{
	 
	 System.out.println( Department_name );
	 System.out.println(Department_id);
	 System.out.println(Department_workers);
	 System.out.println(orgname);

	 
}

	public static void main(String[] args) {
		System.out.println("department");
		 System.out.println("*******************************");
		department Department= new department();
		Department.getdeparmentInfo();
		System.out.println("*******************************");	
		department Department1= new department("PWD",789,90);
		Department1.getdeparmentInfo();

	}

}
