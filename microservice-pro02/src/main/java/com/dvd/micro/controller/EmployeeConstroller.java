package com.dvd.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvd.micro.entity.Employee;
import com.dvd.micro.model.EmployeeVo;
import com.dvd.micro.model.ResponseVo;
import com.dvd.micro.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeConstroller 
{
	@Autowired
	public EmployeeService employeeService;
	
	@GetMapping("/getEmployee/{id}")
    public ResponseVo getEmployee(@PathVariable("id") Long empId)
    {
    	return employeeService.getEmployee(empId);
    }
    
    @PostMapping
    public Employee saveEmployee(@RequestBody EmployeeVo employeeVo)
    {
    	
    	Employee emp = Employee.builder()
    			.empName(employeeVo.getEmpName())
    			.empAddress(employeeVo.getEmpAddress())
    			.empSalary(employeeVo.getEmpSalary())
    			.deptId(employeeVo.getDeptId())
    			.build();
    	
    	return employeeService.saveEmployee(emp);
    	
    }

}
