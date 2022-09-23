
/* This is a hiebernate based java program in which we perform operations like add student, delete student, get details of student and perform OneToMany realation.
 @author PRIYANSHU */

//oneToMany
package com.Hiebernate;                                // This is a package name of a project
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;                              // This is a Scanner class

public class App 
{
    public static void main( String[] args )           // This is a main method 
    {
       
     Scanner ps=new Scanner(System.in);                // Here we create object of Scanner class
     List<bikeStudent> bikeList = new ArrayList<bikeStudent>();
 	 List<student> stList = new ArrayList<student>();
     int stuId,id,bk,n;                                // This is a instance variable stuId,id,bk,n
	 String stuName, md, bike;                         // This is a instance variable stuName,md,bike
	 String stuStrem;                                  // This is a instance variable stuStream
	 int stuMarks;                                     // This is a instance variable stuMarks
	 studentDao sd=new studentDao();                   // Here we create object of studentDao class
	 student st=new student();                         // Here we create object of student class
	 bikeStudent bs=new  bikeStudent();                // Here we create object of bikeStudent class
	
	 int op=0;
	 while(op<4)                                       // Here we create while loop for iterating operations again and again 
	 {
		 System.out.println("PRESS 1. FOR ADD STUDENT \nPRESS 2. FOR GET DETAILS OF STUDENT \nPRESS 3. FOR DELETE STUDENT\nPRESS 4. FOR EXIT");
		 op=ps.nextInt();
		 switch(op)
		 {
		 case 1->{
			 
			 System.out.println("Enter your id");             // Here we take student's id 
			 stuId=ps.nextInt();                              // Here we add student's enter id into instance variable stuId
			 st.setStuId(stuId);                              // Here we set student's id 
			 bs.setBikeNum(stuId);                            // Here we add student's id on bikeStudent class
			 System.out.println("Enter your name");           // Here we take student's name 
			 stuName=ps.next();                               // Here we add student's enter name into instance variable stuName
			 st.setStuName(stuName);                          // Here we set student's name
			 System.out.println("Enter your stream");         // Here we take student's stream
			 stuStrem=ps.next();                              // Here we add student's enter stream into instance variable stuStrem
			 st.setStuStrem(stuStrem);                        // Here we set student's stream
			 System.out.println("Enter your marks");          // Here we take student's Marks
			 stuMarks=ps.nextInt();                           // Here we add student's enter marks into instance variable stuMarks
			 st.setStuMarks(stuMarks);                        // Here we set student's marks
			 System.out.print("Enter how many bikes you want to add ");
			 n = ps.nextInt();                             
			 sd.connect();
		  for(int i = 1;i<=n;i++) {                           // Here we perform operations related to add bikes to student 
			   bikeStudent bke = new bikeStudent();
			   System.out.println("Enter "+i+" Your  bike id ");
		       id = ps.nextInt();
			   bke.setBikeNum(id);
			   System.out.println("Enter "+i+" Your bike company ");
		       bike = ps.next();
			   bke.setBikeCompany(bike);
			   System.out.println("Enter "+i+" Your bike model ");
			   md = ps.next();
			   bke.setBikeModel(md);
			   System.out.println("Enter "+i+" Your bike engine ");
			   bk = ps.nextInt();
			   bke.setBikeEngine(bk);
			   sd.bikeAdd(bke);
			   bikeList.add(bke);
				}
			   st.setL(bikeList);
			   sd.studentAdd(st);
			
		        }
		 case 2->{
			                                                  // Here we perform operations which are related to add student
			 System.out.println("Enter your id for get information");
			 stuId=ps.nextInt();
			 sd.connect();
			 st=sd.getStudent(stuId);
			 System.out.println(st);                          // Here we return student as a output
			 
			
		 }
		 case 3->{                                            // Here we perform operations which are realated to delete student
			 System.out.println("Enter your id for delete student");
			 stuId=ps.nextInt();
			 sd.connect();
			 int delete=sd.deleteStudent(stuId);
			 if(delete==1)                                    // Here we check a condition if student is already present in the database or not
				 System.out.println("successfully deleted");
			 else
				 System.out.println(" student not found ");
		 }
		 }
	 }
    }
}
