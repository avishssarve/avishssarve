package com.casestudy.model;

public class Pet 
{
	private int petid;
	private String petName;
	private int petAge;
	private int getPetid() {
		return petid;
	}
	private void setPetid(int petid) {
		this.petid = petid;
	}
	private String getPetName() {
		return petName;
	}
	private void setPetName(String petName) {
		this.petName = petName;
	}
	private int getPetAge() {
		return petAge;
	}
	private void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	private String getPetPlace() {
		return petPlace;
	}
	private void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}
	private String petPlace;
}
