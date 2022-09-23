/* This is a hiebernate based java program in which we perform operations like add student, delete student, get details of student and perform OneToMany realation.
 @author PRIYANSHU */
//oneToMany

package com.Hiebernate;                                   // This is a package name of a project

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class studentDao {
	
	Configuration conf; 
	SessionFactory ses;
	Session ps;
	Transaction ts;
	public void connect() {                               // This is a connect method 
		conf=new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(bikeStudent.class);
		ses=conf.buildSessionFactory();
		ps=ses.openSession();
		ts=ps.beginTransaction();
	}
    public Session studentAdd(student s)                  // This is a method which is use for add student 
    {
    	ps.save(s);
    	ts.commit();
    	return ps;
    	
    }
    public Session bikeAdd(bikeStudent b) {               // This is a method which is use for add student's bike
		ps.save(b);
		return ps;
	}
    
    public student getStudent(int empId)                  // This is a method which is use for get details of student
    {
    	student st=(student)ps.load(student.class, empId);
    	ts.commit();
    	return st;
    	
    }
    
    public int deleteStudent(int sId)                     // This is a method which is use for delete student
    {
    	Query qu=ps.createQuery("delete from student s where s.stuId=: Id").setParameter("Id", sId);
    	int count=qu.executeUpdate();
    	return count;
    }
	
}