package com.globalmatics.bike.models;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Bike {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@Column(name="name")
private String name;

@Column(name="email")
private String email;

@Column(name="phone")
private String phone;

@Column(name="model")
private String model;

@Column(name="serialNumber")
private String serialNumber;

@Column(name="purchasePrice")
private BigDecimal purchasePrice;

@Column(name="purchaseDate")
private String purchaseDate;
private boolean contact;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getSerialNumber() {
	return serialNumber;
}
public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}
public BigDecimal getPurchasePrice() {
	return purchasePrice;
}
public void setPurchasePrice(BigDecimal purchasePrice) {
	this.purchasePrice = purchasePrice;
}
public String getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseDate(String purchaseDate) {
	this.purchaseDate = purchaseDate;
}
public boolean isContact() {
	return contact;
}
public void setContact(boolean contact) {
	this.contact = contact;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

}
