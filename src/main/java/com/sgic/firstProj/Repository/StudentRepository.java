package com.sgic.firstProj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.firstProj.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
	
}
