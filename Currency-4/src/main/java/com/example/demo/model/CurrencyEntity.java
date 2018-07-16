package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CurrencyEntity {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

private String name;

/*private Object object;

public Object getObject() {
	return object;
}

public void setObject(Object object) {
	this.object = object;
}*/

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
