package ojt.simpletask.app.bl.service.student.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ojt.simpletask.app.bl.dto.StudentDTO;
import ojt.simpletask.app.bl.service.student.StudentService;
import ojt.simpletask.app.persistence.dao.student.StudentDAO;
import ojt.simpletask.app.persistence.entity.Student;
import ojt.simpletask.app.web.form.StudentForm;

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
	public void doAddStudent(StudentForm student) {
		Student std = new Student(student);
		studentDAO.dbAddStudent(std);
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
	public List<StudentDTO> doGetAllStudent() {
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		for (Student student : this.studentDAO.dbGetAllStudents()) {
			StudentDTO studentDto = new StudentDTO(student);
			studentList.add(studentDto);
		}
		return studentList;
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
	public StudentDTO doGetStudentById(Integer id) {
		Student student = this.studentDAO.dbGetStudentById(id);
		StudentDTO studentForm = student != null ? new StudentDTO(student) : null;
		return studentForm;
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
	public void doUpdateStudent(StudentForm std) {
		Student student = this.studentDAO.dbGetStudentById(std.getId());
		student.setId(std.getId());
		student.setName(std.getName());
		student.setRoll(std.getRoll());
		student.setAge(std.getAge());
		student.setGender(std.getGender());
		studentDAO.dbUpdateStudent(student);
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
	public void doDeleteStudent(Integer id) {
		studentDAO.dbDeleteStudent(id);
	}
}
