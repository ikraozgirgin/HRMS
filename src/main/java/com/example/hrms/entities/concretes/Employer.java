package com.example.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employers")
@Data
public class Employer {

	@Id
	@GeneratedValue
	@Column(name = "UserId")
	private int userId;
	
	@Column(name = "CompanyName")
	private String companyName;
	
	@Column(name = "Website")
	private String website;
	
	@Column(name = "PhoneNumber")
	private String phoneNumber;
	
	@Column(name = "RegisterId")
	private int registerId;
	
	public Employer() {}

	public Employer(int userId, String companyName, String website, String phoneNumber, int registerId) {
		super();
		this.userId = userId;
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
		this.registerId = registerId;
	}
}
