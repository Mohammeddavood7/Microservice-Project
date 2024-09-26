package com.dvd.micro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvd.micro.entity.Department;
import com.dvd.micro.repository.DepartmentRepository;

@Service
public class DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department getDepartment(Long deptId)
	{
		return departmentRepository.findById(deptId).get();
	}
	

	public Department saveDepartment(Department department)
	{
		return departmentRepository.save(department);		
	}

}



















