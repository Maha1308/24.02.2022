package com.finall;

public class bank {
	final int Acc_no = 5678953;
	String Holder_name;
	double amount;
	 public bank()
	 {
		
		 Holder_name="priya";
		 amount=89675.9;
	 }
	 
	 public void getbankinfo() {
		 System.out.println(Acc_no);
		 System.out.println(Holder_name);
		 System.out.println(amount);
	 }
	 public static void main(String[] args) {
	 
		 bank Bank=new bank();
		 Bank.getbankinfo();
	 }
}

