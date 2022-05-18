package com.springboot.beans.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CONTACT_DETAILS")
public class contact {

	@Id
	@GeneratedValue
	private int cid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
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
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getSwitchact() {
		return switchact;
	}
	public void setSwitchact(String switchact) {
		this.switchact = switchact;
	}
	private String name;
	@Override
	public String toString() {
		return "contact [cid=" + cid + ", name=" + name + ", email=" + email + ", phoneno=" + phoneno + ", switchact="
				+ switchact + "]";
	}
	private String email;
	private long phoneno;
	private String switchact;
}
