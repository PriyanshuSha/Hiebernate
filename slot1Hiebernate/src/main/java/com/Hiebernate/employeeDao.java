/* It is a part of  hiebernate based java program in which we perform inheritance */
//inheritance


package com.Hiebernate;                                       // This is a package name of a project

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class employeeDao {
	Configuration conf; 
	SessionFactory ses;
	Session ps;
	Transaction ts;
	public void connect() {                                  // This is a connect method 
		conf=new Configuration().configure().addAnnotatedClass(employeee.class).addAnnotatedClass(employeeFresher.class).addAnnotatedClass(employeeExperience.class);
		ses=conf.buildSessionFactory();
		ps=ses.openSession();
		ts=ps.beginTransaction();
	}
	public void addEmployee(employeee s) {                   // This is a method which is use for add employee          
		ps.save(s);
		ts.commit();
		ps.close();
	}
    public void addEmployee(employeeFresher f) {             // This is a method which is use for add fresher employee      
		ps.save(f);
		ts.commit();
		ps.close();
	}
    public void addEmployee(employeeExperience x) {          // This is a method which is use for add Experience employee  
	    ps.save(x);
	    ts.commit();
	    ps.close();
}
	public employeee getDetails(int  empId) {                // This is a method which is use for getDetails of employee  
		
		employeee ep=(employeee)ps.load(employeee.class,  empId);
		ts.commit();
	    return ep;}
	
    public int deleteEmployee(int  empId) {                  // This is a method which is use for delete employee
		
		employeee ep=(employeee)ps.load(employeee.class,  empId);
		ts.commit();
	    return 1;}
	
	
	
}
