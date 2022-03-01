package com.scm.javatraining.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scm.javatraining.dao.StudentDAO;
import com.scm.javatraining.model.Student;
import com.scm.javatraining.service.StudentService;

/**
 * <h2>StudentServiceImpl Class</h2>
 * <p>
 * Process for Displaying StudentServiceImpl
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
@Transactional
@Service
public class StudentServiceImpl implements StudentService {

	/**
	 * <h2>studentDAO</h2>
	 * <p>
	 * studentDAO
	 * </p>
	 */
	@Autowired
	private StudentDAO studentDAO;

	/**
	 * <h2>addStudent</h2>
	 * <p>
	 * Add new student
	 * </p>
	 * 
	 * @param student Student
	 */
	@Override
	public void addStudent(Student student) {
		studentDAO.addStudent(student);
	}

	/**
	 * <h2>getAllStudents</h2>
	 * <p>
	 * Get all student.
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	/**
	 * <h2>getStudentById</h2>
	 * <p>
	 * Get student by id.
	 * </p>
	 * 
	 * @param id Integer
	 * @return
	 */
	@Override
	public Student getStudentById(Integer id) {
		return studentDAO.getStudentById(id);
	}

	/**
	 * <h2>updateStudent</h2>
	 * <p>
	 * Update student.
	 * </p>
	 * 
	 * @param student Student
	 */
	@Override
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
	}

	/**
	 * <h2>deleteStudent</h2>
	 * <p>
	 * Delete student.
	 * </p>
	 * 
	 * @param id Integer
	 */
	@Override
	public void deleteStudent(Integer id) {
		studentDAO.deleteStudent(id);
	}
}
