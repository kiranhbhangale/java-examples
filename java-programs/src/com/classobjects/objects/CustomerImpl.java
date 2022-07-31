package com.classobjects.objects;

public class CustomerImpl implements Customer {
	
	public String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String customerLastName;

	@Override
	public void openAccount() {
		
		System.out.println("Account Opened");
		
	}

}
