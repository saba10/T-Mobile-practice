package com.example.demo.controller;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import com.example.demo.model.RabbitModel;
import com.example.demo.service.RabbitService;

/**
 * The class <code>RabbitControllerTest</code> contains tests for the class <code>{@link RabbitController}</code>.
 *
 * @generatedBy CodePro at 7/10/18 8:58 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class RabbitControllerTest {
	
	@InjectMocks
	RabbitController fixture;
	
	@Mock
    RabbitService rabbitService;
	
	@Test
	public void testDeleteAll_1()
		throws Exception {
		Mockito.doNothing().when(rabbitService).deleteAll();
		fixture.deleteAll();
	}


	/*@Test(expected=NullPointerException.class)
	public void testDelete()
		throws Exception {
		String name = "";
		Mockito.doNothing().when(rabbitService).delete(Mockito.isA(RabbitModel.class));

		fixture.delete(name);
	}

	@Test(expected=NullPointerException.class)
	public void testGetAge_1()
		throws Exception {
		String name = "";
		
		Mockito.when(rabbitService.getAge(Mockito.isA(RabbitModel.class))).thenReturn(10);
		int result = fixture.getAge(name);
		assertEquals(10, result);
	}
*/
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		MockitoAnnotations.initMocks(this);
	}


	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RabbitControllerTest.class);
	}
}