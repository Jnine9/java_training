package ojt.simpletask.app.persistence.dao.student.impl;

import java.util.List;

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

	@Override
	public void dbAddStudent(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	public List<Student> dbGetAllStudents() {
		return this.sessionFactory.getCurrentSession().createQuery("from Student", Student.class).getResultList();
	}

	@Override
	public Student dbGetStudentById(Integer id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Student student = null;
		String sql = "from Student where id = :id";
		@SuppressWarnings({ "rawtypes" })
		Query query = session.createQuery(sql);
		query.setParameter("id", id);
		student = (Student) query.getSingleResult();
		return student;
	}

	@Override
	public void dbUpdateStudent(Student student) {
		sessionFactory.getCurrentSession().update(student);
	}

	@Override
	public void dbUpdateStudent(int id) {
		// TODO Auto-generated method stub
		Student std = sessionFactory.getCurrentSession().load(Student.class, id);
		if (std != null) {
			sessionFactory.getCurrentSession().delete(std);
		}
	}
}
