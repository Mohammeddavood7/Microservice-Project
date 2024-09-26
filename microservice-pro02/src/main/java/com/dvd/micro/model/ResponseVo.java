package com.dvd.micro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseVo
{
	private EmployeeVo employeeVo;
	private DepartmentVo departmentVo;

}















