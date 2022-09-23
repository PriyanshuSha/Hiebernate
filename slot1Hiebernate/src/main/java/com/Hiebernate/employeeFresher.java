/* It is a part of  hiebernate based java program in which we perform inheritance */
//inheritance


package com.Hiebernate;                                             // This is a package name of a project

import javax.persistence.Entity;                                    // Here we import Entity from javax.persistence package

    @Entity                                                         // We use this annotation for create entity in the table 
  public class employeeFresher extends employeee{                   // Here we extends employeee class for perform inheritance
	
	private int empContractPeriod;                                  // This is a private instance variable empContractPeriod
	private int empINcrement;                                       // This is a private instance variable  empINcrement
	public int getEmpContractPeriod() {                             // These all are getters and setters 
		return empContractPeriod;
	}
  public void setEmpContractPeriod(int empContractPeriod) {
		this.empContractPeriod = empContractPeriod;
	}
  public int getEmpINcrement() {
		return empINcrement;
	}
  public void setEmpINcrement(int empINcrement) {
		this.empINcrement = empINcrement;
	}
	@Override
  public String toString() {                                         // Here we generate toString
		return "employeeFresher [empContractPeriod=" + empContractPeriod + ", empINcrement=" + empINcrement + "]";
	}
	
	

}
