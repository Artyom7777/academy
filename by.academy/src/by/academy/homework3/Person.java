package by.academy.homework3;

import by.academy.homework3.validate.copy.BelarusPhoneValidator;
import by.academy.homework3.validate.copy.EmailValidator;
import by.academy.homework3.validate.copy.DateValidator;
import by.academy.homework3.validate.copy.Validator;


public class Person {
	
	private String name;
	private double cash;
	private String phone;
	private String email;
	private String dateOfBirth;

	public Person(String name, double cash, String phone, String email, String dateOfBirth) {
		super();
		this.name = name;
		this.cash = cash;
		this.phone = this.validatePhone(phone);
		this.email = this.validateEmail(email);
		this.dateOfBirth = this.validateDate(dateOfBirth);
	}
	private String validatePhone(String phone) {
		Validator bpv = new BelarusPhoneValidator();
		if(bpv.isValid(phone)) {
			return phone;
			
		} 
		throw new Error("Phone is not valid!");
				
	}
	private String validateEmail(String email) {
		Validator ev = new EmailValidator();
		if(ev.isValid(email)) {
			return email;
			
		} 
		throw new Error("Email is not valid!");
				
	}
	private String validateDate(String dateOfBirth) {
		Validator dev = new DateValidator();
		if(dev.isValid(dateOfBirth)) {
			return dateOfBirth;
			
		} 
		throw new Error("Date is not valid!");
				
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
