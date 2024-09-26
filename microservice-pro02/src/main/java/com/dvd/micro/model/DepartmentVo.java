package com.dvd.micro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentVo 
{
	   private Long deptId;
	   private String deptName;
	   private String deptLocation;

}
