package ojt.simpletask.app.bl.service.student;

import java.util.List;

import ojt.simpletask.app.bl.dto.StudentDTO;
import ojt.simpletask.app.web.form.StudentForm;

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
	 * <h2>doAddStudent</h2>
	 * <p>
	 * Add new Student.
	 * </p>
	 *
	 * @param student Student
	 * @return void
	 */
	public void doAddStudent(StudentForm student);

	/**
	 * <h2>doGetAllStudent</h2>
	 * <p>
	 * Get all student.
	 * </p>
	 *
	 * @return
	 * @return List<Student>
	 */
	public List<StudentDTO> doGetAllStudent();

	/**
	 * <h2>doGetStudentById</h2>
	 * <p>
	 * Get student by ID.
	 * </p>
	 *
	 * @param id int
	 * @return
	 * @return Student
	 */
	public StudentDTO doGetStudentById(Integer id);

	/**
	 * <h2>doUpdateStudent</h2>
	 * <p>
	 * Update student.
	 * </p>
	 *
	 * @param student Student
	 * @return void
	 */
	public void doUpdateStudent(StudentForm student);

	/**
	 * <h2>doDeleteStudent</h2>
	 * <p>
	 * Delete student.
	 * </p>
	 *
	 * @param id Integer
	 * @return void
	 */
	public void doDeleteStudent(Integer id);
}
