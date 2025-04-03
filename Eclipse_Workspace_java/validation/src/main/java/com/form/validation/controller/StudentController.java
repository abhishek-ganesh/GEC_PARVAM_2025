package com.form.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.validation.dto.StudentDTO;
import com.form.validation.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping({"","/"})
	public String home() {
		return "home";
	}

	@GetMapping("/add-student")
	public String addStudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}

	@PostMapping("/add-student")
	public String addStudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add_student";
		}
		studentService.saveStudent(studentDTO);
		return "redirect:/";
	}

}
