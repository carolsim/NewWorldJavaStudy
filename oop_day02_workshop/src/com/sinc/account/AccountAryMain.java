package com.sinc.account;

public class AccountAryMain {

	public static void main(String[] args) {
		Account[] accs = new Account[5];
		for(int i=0;i<5;i++) {
			accs[i]= new Account("221-0101-211"+(Integer.toString(i+1)),100000,4.5);
		}
		for(int i=0;i<5;i++) {
			System.out.println(accs[i].accountInfo());
		}
		for(int i=0;i<5;i++) {
			accs[i].setInterestRate(3.7);
			System.out.println(accs[i].accountInfo());
			System.out.println("이자: "+ (int)(accs[i].getInterestRate()*1000)+"원");
		}
		
	}

}
