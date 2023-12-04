package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.NewEmployee;

public interface NewEmployeeDao extends JpaRepository<NewEmployee, Integer>{

}
