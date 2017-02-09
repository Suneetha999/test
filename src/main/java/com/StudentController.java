package com;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Student student  = new Student();		
		map.put("student", student);
		map.put("studentList", studentService.getAllStudent());		
		return "Student";		
	}
	
	@RequestMapping(value="./student.do", method = RequestMethod.POST)
	public String doAction(@ModelAttribute Student student, BindingResult result,@RequestParam String action ,Map<String, Object> map){
	Student studentValue  = new Student();
	
	switch(action.toLowerCase()){
	case  "add" :
		studentService.add(student);
		studentValue = student;
		break;
	case "edit":
		studentService.edit(student);
		studentValue = student;
		break;
	case "delete":
		studentService.delete(student.getStudentId());
		studentValue = student;
		break;
	case "search":
		Student searchStudent  = studentService.getStudent(student.getStudentId());
		studentValue = searchStudent !=null ? searchStudent :new Student();
		break;
	
	}
	
	map.put("student", studentValue);
	map.put("studentList", studentService.getAllStudent());	
	
	return "Student";
	}
		
}
