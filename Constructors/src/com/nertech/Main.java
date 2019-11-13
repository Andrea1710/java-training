package com.nertech;

public class Main {

	public static void main(String[] args) {

		Account bobsAccount = new Account();	
		System.out.println(bobsAccount.getNumber());
		System.out.println(bobsAccount.getBalance());
		
		bobsAccount.withdrawal(100.0);
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);
		
		Account timsAccount = new Account("Tim", "tim@email.com", "12345");
		System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
		
		VipCustomer firstCustomer = new VipCustomer();
		System.out.println(firstCustomer.getName());
		System.out.println(firstCustomer.getEmailAddress());
		
		VipCustomer secondCustomer = new VipCustomer("Bob", 25000.00);
		System.out.println(secondCustomer.getName());
		
		VipCustomer thirdCustomer = new VipCustomer("Tim", 100.00, "tim@email.com");
		System.out.println(thirdCustomer.getName());
		System.out.println(thirdCustomer.getEmailAddress());
	}
}
