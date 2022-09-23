/* This is a hiebernate based java program in which we perform operations like add student, delete student, get details of student and perform OneToMany realation.
 @author PRIYANSHU */
//oneToMany

package com.Hiebernate;                               // This is a package name of a project

import java.util.List;

import javax.persistence.Entity;                      // Here we import Entity from javax.persistence package
import javax.persistence.Id;                          // Here we import Id from javax.persistence package
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

    @Entity                                           // We use this annotation for create entity in the table
 public class student {
	@Id                                               // We use this annotation for create primary key in the table
	private int stuId;                                // This is a private instance variable  stuId
	private String stuName;                           // This is a private instance variable  stuName
	private String stuStrem;                          // This is a private instance variable  stuStrem
	private int stuMarks;                             // This is a private instance variable  stuMarks
	
	@OneToMany                                        // We use this annotation for represent oneToMany relation
	@JoinColumn(name = "stuId")                       // Here we join columns 
	private List<bikeStudent> l;

                                                      // These all are getters and setters
 public int getStuId() {
		return stuId;
	}
 public void setStuId(int stuId) {
		this.stuId = stuId;
	}
 public String getStuName() {
		return stuName;
	}
 public void setStuName(String stuName) {
		this.stuName = stuName;
	}
 public String getStuStrem() {
		return stuStrem;
	}
 public void setStuStrem(String stuStrem) {
		this.stuStrem = stuStrem;
	}
 public int getStuMarks() {
		return stuMarks;
	}
 public void setStuMarks(int stuMarks) {
		this.stuMarks = stuMarks;
	}
 public List<bikeStudent> getL() {
		return l;
	}
 public void setL(List<bikeStudent> l) {
		this.l = l;
	}
@Override
public String toString() {
	return "student [stuId=" + stuId + ", stuName=" + stuName + ", stuStrem=" + stuStrem + ", stuMarks=" + stuMarks
			+ ", l=" + l + "]";
}



}
