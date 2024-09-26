package com.dvd.micro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long deptId;
   private String deptName;
   private String deptLocation;
}









