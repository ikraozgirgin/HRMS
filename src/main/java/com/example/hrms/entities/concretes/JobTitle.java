package com.example.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "jobtitles")
@Data
public class JobTitle {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Title")
	private String title;

	public JobTitle() {}
	
	public JobTitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

}
