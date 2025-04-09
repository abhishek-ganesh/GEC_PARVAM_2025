package com.form.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.form.validation.dto.StudentDTO;
import com.form.validation.model.Student;
import com.form.validation.repository.StudentRepository;
import com.form.validation.service.StudentService;

import jakarta.validation.Valid;


@Controller

public class StudentController {
	
	private final StudentService studentService;
	private final StudentRepository studentRepository;
	
//	constructor injection
	public StudentController(StudentService studentService, StudentRepository studentRepository) {
		super();
		this.studentService = studentService;
		this.studentRepository = studentRepository;
	}
	
	@GetMapping({"","/"})
	public String home(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
		return "home";
	}

	@GetMapping({"/add-student"})
	public String addStudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}
	
	@PostMapping({"/add-student"})
	public String addStudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, Model model, RedirectAttributes attributes) {
		if (studentDTO.getImage().isEmpty()) {
			result.addError(new FieldError("StudentDTO", "image", "Image is required"));
		}
		
		if (result.hasErrors()) {
			return "add_student";
		}
		System.out.println(studentDTO.getName()+"2");
		studentService.saveStudent(studentDTO);
		attributes.addFlashAttribute("success", "student added successfully");
		return "redirect:/";
	}
		
	
	@GetMapping({"/std-delete"})
	public String deleteStudent(@RequestParam long id, RedirectAttributes attributes) {
		studentService.deleteStudent(id);
		attributes.addFlashAttribute("success", "student deleted successfully");
		return "redirect:/";
	}
	
	@GetMapping({"/std-edit"})
	public String editStudent(@RequestParam long id, Model model) {
		StudentDTO studentDTO = new StudentDTO();
		Student student = studentRepository.findById(id).get();
		model.addAttribute("studentDTO", studentDTO);
		model.addAttribute("student", student);
		return "edit_student";
	}
	
	@PostMapping({"/std-edit"})
	public String updateStudent(@Valid @ModelAttribute StudentDTO studentDTO,BindingResult result, @RequestParam Long id, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			Student student = studentRepository.findById(id).get();
			model.addAttribute("student", student);
			return "edit_student";
		}
		studentService.updateStudent(studentDTO, id);
		attributes.addFlashAttribute("success", "student edited successfully");
		return "redirect:/";
		
	}
	
}
