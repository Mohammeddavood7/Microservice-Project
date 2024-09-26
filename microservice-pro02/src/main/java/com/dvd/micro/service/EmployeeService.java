package com.dvd.micro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvd.micro.client.DepartmentClient;
import com.dvd.micro.entity.Employee;
import com.dvd.micro.model.DepartmentVo;
import com.dvd.micro.model.EmployeeVo;
import com.dvd.micro.model.ResponseVo;
import com.dvd.micro.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService
{
   @Autowired
   private EmployeeRepository employeeRepository;
   
   @Autowired(required = true)
   private DepartmentClient client;
  // private RestTemplate restTemplate;
   
   public ResponseVo getEmployee(Long empId)
   {
	   
       Optional<Employee> employee = employeeRepository.findById(empId);
       
       Employee emp = null;
       if(employee.isPresent())
       {
    	   log.debug("employee is object is available and {}",empId);
    	   emp = employee.get();
       }
       else
       { 
    	   log.error("employee is object is null/Not Avaliable");
       }
       
       EmployeeVo employeeVo = EmployeeVo.builder()
    		   .empId(emp.getEmpId())
    		   .empName(emp.getEmpName())
    		   .empAddress(emp.getEmpAddress())
    		   .empSalary(emp.getEmpSalary())
    		   .deptId(emp.getDeptId())
    		   .build();
             
      // DepartmentVo dept = restTemplate.getForObject("http://microservice-pro01/department/" + emp.getDeptId(), DepartmentVo.class);
      
      DepartmentVo dept = client.getDepartment(emp.getDeptId());
      
      DepartmentVo departmentVo = DepartmentVo.builder()
    		   .deptId(dept.getDeptId())
    		   .deptName(dept.getDeptName())
    		   .deptLocation(dept.getDeptLocation())
    		   .build();
       
	   return new ResponseVo(employeeVo, departmentVo);
   }
   
   public Employee saveEmployee(Employee employee)
   {
	   return employeeRepository.save(employee);
   }
}












