package com.ncu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.dao.StudentDao;
import com.ncu.model.Student;

@Controller
public class StudentController {
	@Autowired
    private StudentDao studentDAO;
	
    @RequestMapping(value ="/studinfo", method=RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("student") Student student, Model model)
    {
        try
        {
            if(studentDAO.getStudentByRn(student.getRn()) != null);
            studentDAO.updateStudent(student);
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("inside catch");
            studentDAO.saveStudent(student);
        }
        return ("redirect:/stds");
    }
    
    @RequestMapping(value = "/edit/{rn}")
    public String editEmployee(@PathVariable("rn") String rn,@ModelAttribute("student") Student student, Model model)
    {
    	studentDAO.getStudentByRn(rn);
        List<Student> studentList = studentDAO.getAllStudent();
        System.out.println("studentList "+ studentList);
        model.addAttribute("student",student);        
        model.addAttribute("studentList",studentList);
        
        return "stds";
    }
    
    @RequestMapping(value = "/delete/{rn}")
    public String deleteStudent(@PathVariable("rn") String rn, @ModelAttribute("student") Student student, Model model)
    {
    	studentDAO.deleteStudent(rn);
        
        return ("redirect:/stds");
    }

    @RequestMapping(value="/stds")
    public String listStudents(@ModelAttribute("student") Student student, Model model)
    {
//        Model model = new Model("employees");

        List<Student> studentList = studentDAO.getAllStudent();
        System.out.println(studentList);
        model.addAttribute("studentList",studentList);
        
        return "student";
    }
}

