package com.scm.javatraining.service;

import java.util.HashMap;
import java.util.List;

import com.scm.javatraining.model.Student;

/**
 * <h2>StudentService Class</h2>
 * <p>
 * Process for Displaying StudentService
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public interface StudentService {
	/**
	 * <h2>addStudent</h2>
	 * <p>
	 * Add new Student.
	 * </p>
	 *
	 * @param student Student
	 * @return void
	 */
	public void addStudent(Student student);

	/**
	 * <h2>getAllStudents</h2>
	 * <p>
	 * Get all student.
	 * </p>
	 *
	 * @return
	 * @return List<Student>
	 */
	public List<Student> getAllStudents();

	/**
	 * <h2>getStudentById</h2>
	 * <p>
	 * Get student by ID.
	 * </p>
	 *
	 * @param id int
	 * @return
	 * @return Student
	 */
	public Student getStudentById(Integer id);

	/**
	 * <h2>updateStudent</h2>
	 * <p>
	 * Update student.
	 * </p>
	 *
	 * @param student Student
	 * @return void
	 */
	public void updateStudent(Student student);

	/**
	 * <h2>deleteStudent</h2>
	 * <p>
	 * Delete student.
	 * </p>
	 *
	 * @param id Integer
	 * @return void
	 */
	public void deleteStudent(Integer id);

	/**
	 * <h2>dataMissing</h2>
	 * <p>
	 * Get missing data list.
	 * </p>
	 *
	 * @param student Student
	 * @return
	 * @return HashMap<String,String>
	 */
	public HashMap<String, String> getMissingData(Student student);

}
