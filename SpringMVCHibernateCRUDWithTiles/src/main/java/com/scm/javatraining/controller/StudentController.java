package com.scm.javatraining.controller;

import java.util.HashMap;
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scm.javatraining.model.Student;
import com.scm.javatraining.service.StudentService;


/**
 * <h2> StudentController Class</h2>
 * <p>
 * Process for Displaying StudentController
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
@Controller
public class StudentController {
	/**
	 * <h2>stdService</h2>
	 * <p>
	 * Student service.
	 * </p>
	 */
	@Autowired
	private StudentService studentService;

	/**
	 * <h2>addStudent</h2>
	 * <p>
	 * Add new Student
	 * </p>
	 *
	 * @param std Student
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student") Student std) {
		ModelAndView model = new ModelAndView();

		if (std.isDataNull()) {
			model = this.dataMissing(std);
		} else {
			model.setViewName("redirect:/students");
			try {
				if (studentService.getStudentById(std.getId()) != null)
					;
				studentService.updateStudent(std);
			} catch (NoResultException e) {
				studentService.addStudent(std);
			}

		}
		return model;
	}

	/**
	 * <h2>editStudent</h2>
	 * <p>
	 * Edit student.
	 * </p>
	 *
	 * @param std Student
	 * @param id  Integer
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = "edit/{id}")
	public ModelAndView editStudent(@ModelAttribute("student") Student std, @PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("students");
		std = studentService.getStudentById(id);
		List<Student> stdList = studentService.getAllStudents();
		model.addObject("student", std);
		model.addObject("studentList", stdList);
		model.addObject("id", id);
		return model;
	}

	/**
	 * <h2>deleteStudent</h2>
	 * <p>
	 * Delete student.
	 * </p>
	 *
	 * @param std Student
	 * @param id  Integer
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = "delete/{id}")
	public ModelAndView deleteStudent(@ModelAttribute("student") Student std, @PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("students");
		studentService.deleteStudent(id);
		List<Student> stdList = studentService.getAllStudents();
		model.addObject("student", std);
		model.addObject("studentList", stdList);
		return model;
	}

	/**
	 * <h2>homePage</h2>
	 * <p>
	 * Home page
	 * </p>
	 *
	 * @param std Student
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/students")
	public ModelAndView homePage(@ModelAttribute("student") Student std) {
		ModelAndView model = new ModelAndView("students");
		List<Student> list = studentService.getAllStudents();
		model.addObject("studentList", list);
		return model;
	}

	/**
	 * <h2>dataMissing</h2>
	 * <p>
	 * Get missing data.
	 * </p>
	 *
	 * @param std Student
	 * @return
	 * @return ModelAndView
	 */
	public ModelAndView dataMissing(Student std) {
		ModelAndView model = new ModelAndView("students");
		List<Student> stdList = studentService.getAllStudents();
		HashMap<String, String> map = studentService.getMissingData(std);
		model.addObject("studentList", stdList);
		model.addObject("dataMissing", map);
		return model;
	}
}
