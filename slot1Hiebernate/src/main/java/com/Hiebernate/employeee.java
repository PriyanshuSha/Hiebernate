/* It is a part of  hiebernate based java program in which we perform inheritance */
//inheritance


package com.Hiebernate;                                       // This is a package name of a project

import javax.persistence.Entity;                              // Here we import Entity from javax.persistence package
import javax.persistence.Id;                                  // Here we import Id from javax.persistence package

    @Entity                                                   // We use this annotation for create entity in the table 
 public class employeee {                                     // This is a main employeee class
	
	@Id                                                       // We use this annotation for set primary key in the table 
	private int empId;                                        // This is a private instance variable empId
	private String empFirstName;                              // This is a private instance variable empFirstName
	private String empLastName;                               // This is a private instance variable empLastName
 public int getEmpId() {                                      // These all are getters and setters 
		return empId;
	}
 public void setEmpId(int empId) {
		this.empId = empId;
	}
 public String getEmpFirstName() {
		return empFirstName;
	}
 public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
 public String getEmpLastName() {
		return empLastName;
	}
 public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
 
	@Override 
 public String toString() {                                   // Here we generate toString
		return "employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName + "]";
	}
	
}
