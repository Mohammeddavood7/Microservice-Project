package com.dvd.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvd.micro.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
	

}
