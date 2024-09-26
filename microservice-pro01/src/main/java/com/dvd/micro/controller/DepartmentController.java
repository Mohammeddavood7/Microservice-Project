package com.dvd.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvd.micro.entity.Department;
import com.dvd.micro.service.DepartmentService;


@RestController
@RequestMapping("/department")
public class DepartmentController 
{

	@Autowired
	private DepartmentService departmentService;
	
       @GetMapping(value = "/{id}")
       public Department getDepartment(@PathVariable("id") Long deptId) 
       {
    	  return  departmentService.getDepartment(deptId);
       }
       
       @PostMapping
       public Department saveDepartment(@RequestBody Department department) 
       {
    	  return  departmentService.saveDepartment(department);
       }
       
	
}



















