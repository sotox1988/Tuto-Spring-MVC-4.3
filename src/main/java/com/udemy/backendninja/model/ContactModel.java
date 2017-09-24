package com.udemy.backendninja.model;

public class ContactModel {

	private int id;
	private String firtsname;
	private String lastname;
	private String telephone;
	private String city;

	public ContactModel() {
		super();
	}

	public ContactModel(int id, String firtsname, String lastname, String telephone, String city) {
		super();
		this.id = id;
		this.firtsname = firtsname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsname() {
		return firtsname;
	}

	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "ContactModel [id=" + id + ", firtsname=" + firtsname + ", lastname=" + lastname + ", telephone="
				+ telephone + ", city=" + city + "]";
	}

}
