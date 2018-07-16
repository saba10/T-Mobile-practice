package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RabbitModel {
	
	
	/*private ArrayList<ArrayList<String>> als;
	
	
	public ArrayList<ArrayList<String>> getAls() {
		return als;
	}
	public void setAls(ArrayList<ArrayList<String>> als) {
		this.als = als;
	}*/
	
	@Id
	private String name;
	private String sex;
	private int age;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}