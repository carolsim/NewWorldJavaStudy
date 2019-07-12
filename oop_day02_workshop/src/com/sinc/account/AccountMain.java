package com.sinc.account;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account("441-0290-1203",500000,7.3);
		System.out.println(ac);
		ac.withdraw(60000000);
		ac.deposit(20000);
		System.out.println(ac);
		System.out.println("이자: "+ac.calculateInterest());
	}

}
