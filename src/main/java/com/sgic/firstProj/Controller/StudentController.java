package com.sgic.firstProj.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.firstProj.Repository.StudentRepository;
import com.sgic.firstProj.entities.Student;

@RestController
public class StudentController {
	@Autowired
  StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getStudent(){
		return studentRepository.findAll();
	}
	@PostMapping("/student")
	public String saveStudent(@RequestBody Student student) {
		 studentRepository.save(student);
		 return "successfully";
	}
	
	@PutMapping("/student")
	public String updateStudent(@RequestBody Student student) {
		 studentRepository.save(student);
		 return "update successfully";
	}
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable Long id) {
		 studentRepository.deleteById(id);
		 return "successfully";
	}
}
