package com.postdemo;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;
@Component
public class StudentDao {
	private static List<Student> stud=new ArrayList<>();

	static int count=3;
	static {
	stud.add(new Student(21,"Pooja",6.25));
	stud.add(new Student(22,"Raju",8.23));
	stud.add(new Student(23,"Nilam",7.95));
	
}
public Student save(Student stud) {
	if(stud.getId()==null)
		stud.setId(++count);
	return stud;
		
}
public List<Student> findAll(){
	return stud;
}
public Student findOne(int id) {
	for(Student s:stud) {
		if(s.getId()==id)
			return s; 
	}

return null;
}
}


