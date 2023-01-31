//package com.example.demo;
//
//import org.hibernate.annotations.GenericGenerator;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//
//@Entity
//public class RegisterModel {
//	@Id
//	@GeneratedValue(generator="increment")
//	@GenericGenerator(name="increment",strategy="increment")
//
//	String name;
//	String surname;
//	String email;
//	String password;
//	public RegisterModel() {
//		super();
//	}
//	
//	public RegisterModel(String name,String surname,String email,String password) {
//		super();
//		this.name=name;
//		this.surname=surname;
//		this.email=email;
//		this.password=password;
//		
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSurname() {
//		return surname;
//	}
//
//	public void setSurname(String surname) {
//		this.surname = surname;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//}
