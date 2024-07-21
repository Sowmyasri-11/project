package com.si.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Long phnnum;
	private String email;
	public Customer() {
	}
	public Customer(Long id, String name, Long phnnum, String email) {
		
		this.id = id;
		this.name = name;
		this.phnnum = phnnum;
		this.email = email;
	}
	public Long getid() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public Long getphnnum() {
		return phnnum;
	}
	public void setphnnum(Long phnnum) {
		this.phnnum = phnnum;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phnnum=" + phnnum + ", email=" + email + "]";
	}
	
	


}
