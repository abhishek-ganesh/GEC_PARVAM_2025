package com.form.validation.service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.form.validation.dto.StudentDTO;
import com.form.validation.model.Student;
import com.form.validation.repository.StudentRepository;

import jakarta.validation.Valid;

@Service

public class StudentService {

	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public void saveStudent(StudentDTO studentDTO) {
		MultipartFile image = studentDTO.getImage();
		Date createAt = new Date();
		String storeImageName = createAt.getTime() + "_" + image.getOriginalFilename();
		System.out.println(storeImageName);

		try {
			String uploadDir = "public/images/";
			Path uploadPath = Paths.get(uploadDir);
			if (!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream, Paths.get(uploadDir + storeImageName), StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		Student students = new Student();
		students.setName(studentDTO.getName());
		students.setAge(studentDTO.getAge());
		students.setEmail(studentDTO.getEmail());
		students.setPassword(studentDTO.getPassword());
		students.setImagepath(storeImageName);
		studentRepository.save(students);
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public void deleteStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		// what is the image path of the student
		String uploadDir = "public/images/";
		Path imagepath = Paths.get(uploadDir + student.getImagepath());
		try {
			Files.delete(imagepath);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}studentRepository.delete(student);

	}

	public StudentDTO editStudent(long id) {
		Student student = studentRepository.findById(id).get();
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(student.getName());
		studentDTO.setAge(student.getAge());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPassword(student.getPassword());
		return studentDTO;
	}

	public void updateStudent(@Valid StudentDTO studentDTO, Long id) {
		Student student = studentRepository.findById(id).get();
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
	}

}
