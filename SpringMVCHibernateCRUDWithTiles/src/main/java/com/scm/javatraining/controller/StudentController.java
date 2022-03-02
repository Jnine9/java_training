package com.scm.javatraining.controller;

import java.util.HashMap;
import java.util.List;

import javax.persistence.NoResultException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scm.javatraining.model.Student;
import com.scm.javatraining.service.StudentService;

/**
 * <h2>StudentController Class</h2>
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
	@RequestMapping(value = "add/student", method = RequestMethod.POST)
	public ModelAndView addStudent(@Valid @ModelAttribute("student") Student std, BindingResult binder) {
		ModelAndView model = new ModelAndView();
		if(!binder.hasErrors()) {
			model.setViewName("redirect:/students");
			studentService.addStudent(std);
		}else {
			model.setViewName("students");
			this.setDefaultModelView(model, "add/student");
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
		model.addObject("student", std);
		model.addObject("id", id);
		this.setDefaultModelView(model, "edit/student");
		return model;
	}
	@RequestMapping(value = "edit/student",method = RequestMethod.POST)
	public ModelAndView updateEdit(@Valid @ModelAttribute("student") Student std,BindingResult binder) {
		ModelAndView model = new ModelAndView();
		if(!binder.hasErrors()) {
			model.setViewName("redirect:/students");
			studentService.updateStudent(std);
		}else {
			model.addObject("student", std);
			model.addObject("id", std.getId());
			this.setDefaultModelView(model, "edit/student");
		}
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
		ModelAndView model = new ModelAndView();
		if(studentService.getStudentById(id)!=null) {
			studentService.deleteStudent(id);
		}
		model.setViewName("redirect:/students");
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
		this.setDefaultModelView(model, "add/student");
		return model;
	}
	/**
	 * <h2> isEditing</h2>
	 * <p>
	 * Check if editing.
	 * </p>
	 *
	 * @param std Student
	 * @return
	 * @return boolean
	 */
	public boolean isEditing(Student std) {
		boolean res = false;
		try {
			if (studentService.getStudentById(std.getId()) != null)
				;
			res = true;
		}catch(NoResultException e) {
			res = false;
		}
		return res;
	}
	public void setDefaultModelView(ModelAndView model,String action) {
		List<Student> list = studentService.getAllStudents();
		model.addObject("studentList", list);
		model.addObject("action", action);
		model.setViewName("students");
	}
}
