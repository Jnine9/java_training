package com.scm.javatraining.dao;

import java.util.List;
import com.scm.javatraining.model.Student;

/**
 * <h2>StudentDAO Class</h2>
 * <p>
 * Process for Displaying StudentDAO
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public interface StudentDAO {
	/**
	 * <h2>addStudent</h2>
	 * <p>
	 * Add new Student
	 * </p>
	 *
	 * @param student Student
	 * @return void
	 */
	public void addStudent(Student student);

	/**
	 * <h2>getAllStudents</h2>
	 * <p>
	 * Get all students.
	 * </p>
	 *
	 * @return
	 * @return List<Student>
	 */
	public List<Student> getAllStudents();

	/**
	 * <h2>getStudentById</h2>
	 * <p>
	 * 
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
	 * Update student
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
	 * @param id int
	 * @return void
	 */
	public void deleteStudent(int id);

}
