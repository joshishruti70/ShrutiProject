package com.example.demo;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class EmpModel {
	//@GeneratedValue(generator="increment")
	  @GenericGenerator(name="increment", strategy = "increment") 
	@Id
int id;
String name;
String surname;
String dob;
String gender;
String mstatus;
String doj;
String designation;
String email;
String password;





public EmpModel(int id,String name,String surname,String designation,String email,String password) {
	super();
	this.id=id;
	this.name=name;
	this.surname=surname;
	this.dob=dob;
	this.gender=gender;
	this.mstatus=mstatus;
	this.doj=doj;
	this.designation=designation;
    this.email=email;
    this.password=password;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getMstatus() {
	return mstatus;
}

public void setMstatus(String mstatus) {
	this.mstatus = mstatus;
}

public String getDoj() {
	return doj;
}

public void setDoj(String doj) {
	this.doj = doj;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

//public void setPassword(String password) {
//	Password = password;
//}

public EmpModel() {
	
}


}
