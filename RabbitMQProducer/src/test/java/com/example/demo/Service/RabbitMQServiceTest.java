package com.example.demo.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import com.example.demo.model.RabbitModel;
import com.example.demo.Service.*;

/**
 * The class <code>RabbitMQServiceTest</code> contains tests for the class <code>{@link RabbitMQService}</code>.
 *
 * @generatedBy CodePro at 7/9/18 12:35 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class RabbitMQServiceTest {
	
	@InjectMocks
	RabbitMQService rabbitMQService;
	
	
	@Test
	public void testRead_1()
		throws Exception {
		rabbitMQService.read();
	}
	

	/*@Test
	public void testTestSend_1()
		throws Exception {
		RabbitMQService fixture = new RabbitMQService();
		String message = "";

		fixture.testSend(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.example.demo.Service.RabbitMQService.testSend(RabbitMQService.java:84)
	}

	@Test
	public void testTestSend2_1()
		throws Exception {
		RabbitMQService fixture = new RabbitMQService();
		RabbitModel rabbitModel = new RabbitModel();

		fixture.testSend2(rabbitModel);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.example.demo.Service.RabbitMQService.testSend2(RabbitMQService.java:89)
	}*/


	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RabbitMQServiceTest.class);
	}
}