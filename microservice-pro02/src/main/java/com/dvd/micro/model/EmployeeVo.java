package com.dvd.micro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeVo 
{
	private Long empId;
	private String empName;
	private Double empSalary;
	private String empAddress;
	private Long deptId;

}
