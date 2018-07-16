package com.example.demo.model;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * The class <code>RabbitModelTest</code> contains tests for the class <code>{@link RabbitModel}</code>.
 *
 * @generatedBy CodePro at 7/9/18 4:00 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class RabbitModelTest {
	
	@InjectMocks
	RabbitModel rabbitModel;
	
	
	@Test
	public void testGetAge_1()
		throws Exception {
		int result = rabbitModel.getAge();
		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 4:00 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		String result = rabbitModel.getName();
		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 4:00 PM
	 */
	@Test
	public void testGetSex_1()
		throws Exception {
		String result = rabbitModel.getSex();
		assertEquals("", result);
	}

	/**
	 * Run the void setAge(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 4:00 PM
	 */
	@Test
	public void testSetAge_1()
		throws Exception {
		rabbitModel.setAge(rabbitModel.getAge());
		assertEquals(1, rabbitModel.getAge());

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 4:00 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		rabbitModel.setName(rabbitModel.getName());

		// add additional test code here
	}

	/**
	 * Run the void setSex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 4:00 PM
	 */
	@Test
	public void testSetSex_1()
		throws Exception {
		rabbitModel.setSex(rabbitModel.getSex());

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 4:00 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		MockitoAnnotations.initMocks(this);
		rabbitModel.setAge(1);
		rabbitModel.setSex("");
		rabbitModel.setName("");
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 4:00 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
		System.gc();
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 7/9/18 4:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RabbitModelTest.class);
	}
}