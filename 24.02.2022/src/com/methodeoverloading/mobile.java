package com.methodeoverloading;

public class mobile {
	
	int mobile_price;
	String mobile_name;
	String mobile_color;
static String orgname;

public mobile()
{
	mobile_price=16000;
	mobile_name="Redmi Note 8 pro";
	mobile_color="bule";
	
}
static 
{
	orgname="Redmi";
	
}
public void getmobileInfo()
{
	 System.out.println("Mobile_details");
	 System.out.println("*******************************");
	 System.out.println(mobile_price);
	 System.out.println(mobile_name);
	 System.out.println(mobile_color);
	 System.out.println(orgname);
}
public void getmobileInfo(int mobile_price,String mobile_name, String mobile_color)
{
	 this.mobile_price=mobile_price;
	 this.mobile_name=mobile_name;
	 this.mobile_color=mobile_color;
	 System.out.println(mobile_price);
	 System.out.println(mobile_name);
	 System.out.println(mobile_color);
	
}


	

	public static void main(String[] args) {
		mobile Mobile= new mobile();
		Mobile.getmobileInfo();
		System.out.println("*******************************");	
		mobile Mobile1= new mobile();
		Mobile1.getmobileInfo(17000,"RedmiA","black");

	}

}
