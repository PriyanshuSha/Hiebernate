/* It is a part of  hiebernate based java program in which we perform inheritance */
//inheritance
package com.Hiebernate;                                 // This is a package name of a project 

import javax.persistence.Entity;                        // Here we import Entity from javax.persistence package

   @Entity                                              // We use this annotation for create entity in the table 
 public class employeeExperience extends employeee {    // Here we extends employeee class for perform inheritance 

   private int empExperience; 	                        // This is a private instance variable empExperience
   private int empHike;                                 // This is a private instance variable empHike
 public int getEmpExperience() {                        // These all are getters and setters 
	return empExperience;
    }
 
 public void setEmpExperience(int empExperience) {
	this.empExperience = empExperience;
    }
 
 public int getEmpHike() {
	return empHike;
    } 
 
 public void setEmpHike(int empHike) {
	this.empHike = empHike;
    }
 
  @Override                                          
 public String toString() {                             // Here we generate toString
	return "employeeExperience [empExperience=" + empExperience + ", empHike=" + empHike + "]";
    } 
	
}
