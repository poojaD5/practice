package com.postdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StudentController {
	@Autowired
	private StudentDao studDao;
	/*@GetMapping("/stud")
	public List<Student> retrieveStudents(){
		return studDao.findAll();}
	
	@GetMapping("/stud1/{id}")
	public Student retrieveStud(@PathVariable int id) {
		return studDao.findOne(id);	}*/
	
	
	
	@PostMapping("/student")
	public void createStud( @RequestBody Student student) {
		Student savedStud=studDao.save(student);
		System.out.println(savedStud.toString());
	}
	

}
