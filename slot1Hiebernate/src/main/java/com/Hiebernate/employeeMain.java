/* This is a hiebernate based java program in which we perform inheritance and operations like add employee,add fresher employee, add Experience employee
 get details of employee and delete employee.
 @author PRIYANSHU */


package com.Hiebernate;                                             // This is a package name of a project 

import java.util.Scanner;                                           // This is a Scanner class
import static java.lang.System.*;                                   // Here we use System class to avoid System from System.out.println
public class employeeMain {

	public static void main(String[] args) {                        // This is a main method 
		
		 int empId;                                                 // This is a instance variable empId
		 int empExperience; 	                                    // This is a instance variable empContractPeriod
		 int empContractPeriod;                                     // This is a instance variable empContractPeriod
	     int empINcrement;                                          // This is a instance variable empINcrement
	     int empHike;                                               // This is a instance variable empHike
	     String empFirstName;                                       // This is a instance variable empFirstName
		 String empLastName;                                        // This is a instance variable empExperience
	     employeeFresher ef =new employeeFresher();                 // Here we create object of employeeFresher class
	     employeeExperience ex=new employeeExperience();            // Here we create object of employeeExperience class
	     employeee em=new employeee();                              // Here we create object of employee class
	     employeeDao dao=new employeeDao();                         // Here we create object of employeeDao class
	     Scanner Ps=new Scanner(System.in);                         // Here we create object of Scanner class
	     
	     int op=0;
		 while(op<6)                                               // Here we create while loop for iterating operations again and again  
		 {
			 out.println("PRESS 1. FOR ADD EMPLOYEE \nPRESS 2. FOR ADD FRESHER EMPLOYE \nPRESS 3. FOR ADD EXPERIENCE EMPLOYEE \nPRESS 4 . FOR GET EMPLOYEE DETAILS \nPRESS 5 . FOR DELETE EMPLOYEE \nPRESS 6. FOR EXIT");
			 op=Ps.nextInt();
			 switch(op)
			 {
			 case 1->{                                              // Here we perform add employee related operations
				 
				 out.println("Enter your Employee Id");             // Here we take Employe's id 
				 empId=Ps.nextInt();                                // Here we add Employe's entered id into instance variable empId
				 em.setEmpId(empId);                                // Here we setEmploye's id
				 out.println("Enter Your First Name");              // Here we take Employe's First name 
				 empFirstName=Ps.next();                            // Here we add Employe's entered First name into instance variable empFirstName
				 em.setEmpFirstName(empFirstName);                  // Here we set Employe's First name
				 out.println("Enter your Last Name ");              // Here we take Employe's Last name
	 			 empLastName=Ps.next();                             // Here we add Employe's entered Last name into instance variable empLastName
				 em.setEmpLastName(empLastName);                    // Here we set Employe's Last name
				 dao.connect();                                     // Here we perform connection
				 dao.addEmployee(em);
				 out.println("details save");
			 }
			 
			 case 2->{                                              // Here we perform add Fresher employee related operations
				 dao.connect();
				 out.println("Enter your Employee Id");             // Here we take Employe's id 
				 empId=Ps.nextInt();                                // Here we add Employe's entered id into instance variable empId
				 ef.setEmpId(empId);                                // Here we setEmploye's id 
				 out.println("Enter Your First Name");              // Here we take Employe's First name
				 empFirstName=Ps.next();                            // Here we add Employe's entered First name into instance variable empFirstName
				 ef.setEmpFirstName(empFirstName);                  // Here we set Employe's First name
				 out.println("Enter your Last Name ");              // Here we take Employe's Last name
	 			 empLastName=Ps.next();                             // Here we add Employe's entered Last name into instance variable empLastName
				 ef.setEmpLastName(empLastName);                    // Here we set Employe's Last name
				 out.println("Enter your contract period ");        // Here we take Employe's contract period 
				 empContractPeriod=Ps.nextInt();                    // Here we add Employe's entered contract period into instance variable  empContractPeriod
				 ef.setEmpContractPeriod(empContractPeriod);        // Here we setEmploye's contract period 
				 out.println("Enter your increment ");              // Here we take Employe's increment 
				 empINcrement=Ps.nextInt();                         // Here we add Employe's entered increment into instance variable  empINcrement
				 ef.setEmpINcrement(empINcrement);                  // Here we setEmploye's increment 
				 dao.addEmployee(ef);
				 
			 }
				 
             case 3->{                                             // Here we perform add Experience employee related operations
				 dao.connect();
				 out.println("Enter your Employee Id");
				 empId=Ps.nextInt();
				 ex.setEmpId(empId);
				 out.println("Enter Your First Name");
				 empFirstName=Ps.next();
				 ex.setEmpFirstName(empFirstName);
				 out.println("Enter your Last Name ");
	 			 empLastName=Ps.next();
				 ex.setEmpLastName(empLastName);
				 out.println("Enter your experience ");
				 empExperience=Ps.nextInt();
				 ex.setEmpExperience(empExperience);
				 out.println("Enter your hike  ");
				 empHike=Ps.nextInt();
				 ex.setEmpHike(empHike);
				 dao.addEmployee(ex);

			 }
             case 4->{                                           // Here we perform get employee details related operations
            	 
            	 out.println("Enter your id for get employee details ");
            	 empId=Ps.nextInt();
    			 dao.connect();
    			 em=dao.getDetails(empId);
    			 out.println(em);
    
             }
             
             case 5->{                                          // Here we perform delete employee related operations                 
            	 System.out.println("Enter your id for delete employee");
            	 empId=Ps.nextInt();
    			 dao.connect();
    			 int delete=dao.deleteEmployee(empId);
    			 if(delete==1) 
    				 out.println("successfully deleted");
    			 else
    				 out.println(" employee not found ");
 
             }
			 }
			 }
		 }
	}
