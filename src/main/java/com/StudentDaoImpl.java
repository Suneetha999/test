package com;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Student student) {
		session.getCurrentSession().save(student);
		
	}

	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);
		
	}

	@Override
	public void delete(int studentId) {
		
		session.getCurrentSession().delete(getStudent(studentId));
		
	}

	@Override
	public Student getStudent(int studentId) {		
		return (Student)session.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List getAllStudent() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Student").list();
	}
	
	
	

}
