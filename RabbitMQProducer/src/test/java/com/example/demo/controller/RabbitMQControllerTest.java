package com.example.demo.controller;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

import java.util.ArrayList;

import com.example.demo.Service.RabbitMQService;
import com.example.demo.model.RabbitModel;

/**
 * The class <code>RabbitMQControllerTest</code> contains tests for the class <code>{@link RabbitMQController}</code>.
 *
 * @generatedBy CodePro at 7/9/18 12:35 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class RabbitMQControllerTest {
	/**
	 * Run the String read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 12:35 PM
	 */
	@InjectMocks
	RabbitMQController rabbitMQController;
	
	@Mock
	RabbitMQService rabbitMQService;
	
	@Mock
	RabbitModel rabbitModel;
	
	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testRead_1()
		throws Exception {
		ArrayList<RabbitModel> arrayList=new ArrayList<RabbitModel>();
		 	
		RabbitModel rabbitModel1=new RabbitModel();
		rabbitModel1.setAge(1);
		rabbitModel1.setSex("M");
		arrayList.add(rabbitModel1);	
		Mockito.when(rabbitMQService.read()).thenReturn(arrayList);
		String result = rabbitMQController.read();
		assertNotNull(result);
	}

	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RabbitMQControllerTest.class);
	}
}