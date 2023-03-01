package com.account.java;

class Account {
String customerName;
int accountNo;
Account(String n, int a){

customerName = n;
accountNo= a;
}
 
void display() {
	System.out.println ("Customer Name:"+customerName);
	System.out.println ("Account No:"+accountNo);
}

}

 class currentAccount extends Account {
	int currentBalance;
		
	currentAccount(String n , int a, int c){
		super(n,a);
		currentBalance = c;
	}
	void display() {
		super.display();
		System.out.println("Current Balance" + currentBalance);
	}
}
	class AccountDetails extends currentAccount {
		int depositAmount;
		int withdrawlAmount;
		AccountDetails(String n, int a , int c , int d, int w){
			super(n,a,c);
			depositAmount = d;
			withdrawlAmount = w;
		}
		void display() {
		super.display();
	System.out.println("Deposit Amount" + depositAmount);
	System.out.println("Withdrawl Amount" + withdrawlAmount);
		}
	}
class driver{
	public static void main (String[]args) {
		AccountDetails p = new AccountDetails("Rahul Changra",1110,5555,999,1562);
		p.display();
		}
}

	



