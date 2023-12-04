package com.example.hrms.entities.concretes;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "candidates")
@Data
public class NewEmployee {
	
	@Id
	@GeneratedValue
	@Column(name = "UserId")
	private int userId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Identity")
	private String identity;
	
	@Column(name = "BirthYear")
	private Date birthYear;
	
	@Column(name = "RegisterId")
	private int registerId;
	
	public NewEmployee() {}

	public NewEmployee(int userId, String firstName, String lastName, String identity, Date birthYear, int registerId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identity = identity;
		this.birthYear = birthYear;
		this.registerId = registerId;
	}
}
