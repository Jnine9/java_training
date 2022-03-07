package ojt.simpletask.app.persistence.dao.student.impl;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ojt.simpletask.app.persistence.dao.student.StudentDAO;
import ojt.simpletask.app.persistence.entity.Student;

/**
 * <h2>StudentDAOImpl Class</h2>
 * <p>
 * Process for Displaying StudentDAOImpl
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

	/**
	 * <h2>sessionFactory</h2>
	 * <p>
	 * sessionFactory
	 * </p>
	 */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * <h2>dbAddStudent</h2>
	 * <p>
	 * Add new student.
	 * </p>
	 * 
	 * @param student Student
	 */
	@Override
	public void dbAddStudent(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	/**
	 * <h2>dbGetAllStudents</h2>
	 * <p>
	 * Get all student.
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<Student> dbGetAllStudents() {
		return this.sessionFactory.getCurrentSession().createQuery("from Student", Student.class).getResultList();
	}

	/**
	 * <h2>dbGetStudentById</h2>
	 * <p>
	 * Get student by id.
	 * </p>
	 * 
	 * @param id int
	 * @return
	 */
	@Override
	public Student dbGetStudentById(Integer id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Student student = null;
		try {
			String sql = "from Student where id = :id";
			@SuppressWarnings({ "rawtypes" })
			Query query = session.createQuery(sql);
			query.setParameter("id", id);
			student = (Student) query.getSingleResult();
		} catch (NoResultException e) {
			student = null;
		}
		return student;
	}

	/**
	 * <h2>dbUpdateStudent</h2>
	 * <p>
	 * Update student.
	 * </p>
	 * 
	 * @param student Student
	 */
	@Override
	public void dbUpdateStudent(Student student) {
		sessionFactory.getCurrentSession().update(student);
	}

	/**
	 * <h2>dbDeleteStudent</h2>
	 * <p>
	 * To delete student.
	 * </p>
	 * 
	 * @param id int
	 */
	@Override
	public void dbDeleteStudent(int id) {
		// TODO Auto-generated method stub
		Student std = sessionFactory.getCurrentSession().load(Student.class, id);
		if (std != null) {
			sessionFactory.getCurrentSession().delete(std);
		}
	}
}
