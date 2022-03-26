package com.supermethod;

public class laptop extends organization {
	String name;
	String ram;
	String processor;
	double rate;
	static String orgname;
	
public laptop()
{
	super();
	name="Lenova";
	ram="4GB";
processor="Intal-Corei";
rate=42000.98;
System.out.println("employee class constructor define");
}
	//block
static
{
orgname="laptop";
}
 public  void getlaptopInfor()
 {
	 System.out.println(name);
	 System.out.println(ram);
	 System.out.println(processor);
	 System.out.println(rate);
	 System.out.println(super.name);
	 System.out.println(super.ram);
 }
	public static void main(String[] args) {
		laptop laptop1=new laptop();
		
		
	}

}
