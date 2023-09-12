package com.looser.departmentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looser.departmentservice.Exception.BussinessException;
import com.looser.departmentservice.entity.Department;
import com.looser.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	
	}

	public Department findByDepartmentId(Long id) {
		return departmentRepository.findByDepartmentId(id);
	}

	

	

	

}
