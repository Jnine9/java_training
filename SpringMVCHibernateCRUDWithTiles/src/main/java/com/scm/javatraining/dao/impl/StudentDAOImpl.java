package com.scm.javatraining.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scm.javatraining.dao.StudentDAO;
import com.scm.javatraining.model.Student;

/**
 * <h2> StudentDAOImpl Class</h2>
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
	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		return sessionFactory.getCurrentSession().createQuery("from Student").getResultList();
	}

	@Override
	public Student getStudentById(Integer id) {
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
	public void updateStudent(Student student) {
		sessionFactory.getCurrentSession().update(student);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		Student std = sessionFactory.getCurrentSession().load(Student.class, id);
		if (std != null) {
			sessionFactory.getCurrentSession().delete(std);
		}
	}
}
