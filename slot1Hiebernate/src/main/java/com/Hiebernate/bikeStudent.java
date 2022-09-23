/* This is a hiebernate based java program in which we perform operations like add student, delete student, get details of student and perform OneToMany realation.
 @author PRIYANSHU */
//oneToMany


package com.Hiebernate;                            // This is a package name of a project

import javax.persistence.Entity;                   // Here we import Entity from javax.persistence package
import javax.persistence.Id;                       // Here we import Id from javax.persistence package

    @Entity                                        // We use this annotation for create entity in the table
 public class bikeStudent {
	@Id                                            // We use this annotation for create primary key in the table
   private int bikeNum;                            // This is a private instance variable  bikeNum
   private String bikeCompany;                     // This is a private instance variable  bikeCompany
   private String bikeModel;                       // This is a private instance variable  bikeModel
   private int bikeEngine;                         // This is a private instance variable  bikeEngine 
                                                   // These all are getters and setters
 public int getBikeNum() {                         
	return bikeNum;
    }
 public void setBikeNum(int bikeNum) {
	this.bikeNum = bikeNum;
    }
 public String getBikeCompany() {
	return bikeCompany;
    }
 public void setBikeCompany(String bikeCompany) {
	this.bikeCompany = bikeCompany;
    }
 public String getBikeModel() {
	return bikeModel;
    }
 public void setBikeModel(String bikeModel) {
	this.bikeModel = bikeModel;
    }
 public int getBikeEngine() {
	return bikeEngine;
    }
 public void setBikeEngine(int bikeEngine) {
	this.bikeEngine = bikeEngine;
    }
   @Override
 public String toString() {                       // Here we generate toString
	return "bikeStudent [bikeNum=" + bikeNum + ", bikeCompany=" + bikeCompany + ", bikeModel=" + bikeModel
			+ ", bikeEngine=" + bikeEngine + "]";
    } 

}
