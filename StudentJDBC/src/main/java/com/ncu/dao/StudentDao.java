package com.ncu.dao;

import java.util.List;

import com.ncu.model.Student;

public interface StudentDao {

	 public void saveStudent(Student student);
	    public Student getStudentByRn(String rn);
	    public void updateStudent(Student student);
	    public void deleteStudent(String rn);
	    public List<Student> getAllStudent();
	
}
