package ojt.simpletask.app.persistence.dao.student;

import java.util.List;

import ojt.simpletask.app.persistence.entity.Student;

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
	public void dbAddStudent(Student student);

	/**
	 * <h2>getAllStudents</h2>
	 * <p>
	 * Get all students.
	 * </p>
	 *
	 * @return
	 * @return List<Student>
	 */
	public List<Student> dbGetAllStudents();

	/**
	 * <h2>getStudentById</h2>
	 * <p>
	 * Get sutdent by Id.
	 * </p>
	 *
	 * @param id int
	 * @return
	 * @return Student
	 */
	public Student dbGetStudentById(Integer id);

	/**
	 * <h2>updateStudent</h2>
	 * <p>
	 * Update student
	 * </p>
	 *
	 * @param student Student
	 * @return void
	 */
	public void dbUpdateStudent(Student student);

	/**
	 * <h2>deleteStudent</h2>
	 * <p>
	 * Delete student.
	 * </p>
	 *
	 * @param id int
	 * @return void
	 */
	public void dbDeleteStudent(int id);
}
