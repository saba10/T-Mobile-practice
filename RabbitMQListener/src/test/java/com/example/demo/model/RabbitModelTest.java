package com.example.demo.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



/**
 * The class <code>RabbitModelTest</code> contains tests for the class <code>{@link RabbitModel}</code>.
 *
 * @generatedBy CodePro at 7/9/18 8:38 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class RabbitModelTest
 {
	RabbitModel rabbitModel;
	
	@Before
	public void setUp() {
	rabbitModel= new RabbitModel();
	rabbitModel.setAge(1);
	rabbitModel.setName("a");
	rabbitModel.setSex("m");
	}
	
	
	@Test
	public void testGetAge() {
		int result=rabbitModel.getAge();
		assertEquals(1,result);
		
	}
	
	@Test
	public void testGetName() {
		String result=rabbitModel.getName();
		assertEquals("a",result);
	}
	
	@Test
	public void testGetSex() {
		String result=rabbitModel.getSex();
		assertEquals("m",result);
	}
	
	@Test
	public void testSetAge() {
		rabbitModel.setAge(rabbitModel.getAge());
	}
	
	@Test
	public void testsetName() {
		rabbitModel.setName("a");
	}
	
	@Test
	public void testsetSex() {
		rabbitModel.setSex("m");
	}
	
}