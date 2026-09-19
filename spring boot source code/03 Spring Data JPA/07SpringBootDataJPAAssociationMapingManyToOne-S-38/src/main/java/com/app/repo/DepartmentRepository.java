package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Department;

public interface DepartmentRepository extends  JpaRepository<Department, Integer> {

}
