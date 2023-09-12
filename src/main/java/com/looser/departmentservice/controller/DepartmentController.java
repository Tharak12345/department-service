package com.looser.departmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.looser.departmentservice.entity.Department;
import com.looser.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	
	}
	@GetMapping("/{id}")
	public Department findByDepartmentId(@PathVariable("id") Long id ) {
		return departmentService.findByDepartmentId(id);
	}
	/*
	 * @GetMapping("/depart") public String getUser() { return
	 * "the department works";
	 * 
	 * }
	 */
	
	
}
