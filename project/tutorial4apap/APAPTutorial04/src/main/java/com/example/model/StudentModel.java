package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentModel
{
    private String npm;
    private String name;
    private Double gpa;
    
//    public StudentModel (String npm, String name, Double gpa) {
//    		this.npm=npm;
//    		this.name=name;
//    		this.gpa=gpa;
//    }
//	
//	public String getNPM () {
//		return npm;
//	}
//	
//	public void setNPM (String npm) {
//		this.npm=npm;
//	}
//	
//	public String getName () {
//		return name;
//	}
//	
//	public void setName (String name) {
//		this.name=name;
//	}
//	
//	public Double getGPA () {
//		return gpa;
//	}
//	
//	public void setGPA (Double gpa) {
//		this.gpa=gpa;
//	}
}
