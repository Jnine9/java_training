package ojt.simpletask.app.bl.service.student;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

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
	 * <h2>doGetSrudentById</h2>
	 * <p>
	 * Get student by ID.
	 * </p>
	 *
	 * @param id int
	 * @return
	 * @return Student
	 */
	public StudentDTO doGetSrudentById(Integer id);

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

	/**
	 * <h2>setDefaultModelView</h2>
	 * <p>
	 * Set default model and view, to view all default list and it's specified
	 * action.
	 * </p>
	 *
	 * @param model  ModelAndView
	 * @param action String
	 * @return void
	 */
	public void setDefaultModelView(ModelAndView model, String action);
}
