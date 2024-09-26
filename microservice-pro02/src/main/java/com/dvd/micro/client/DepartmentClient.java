package com.dvd.micro.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dvd.micro.model.DepartmentVo;

@FeignClient(name = "microservice-pro01")
public interface DepartmentClient 
{
	
	@GetMapping("/department/{id}")
    public DepartmentVo getDepartment(@PathVariable("id") Long deptId);

}
