package com.example.demo.service;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import com.example.demo.model.RabbitModel;
import com.example.demo.repo.RabbitRepo;

/**
 * The class <code>RabbitServiceTest</code> contains tests for the class <code>{@link RabbitService}</code>.
 *
 * @generatedBy CodePro at 7/9/18 4:55 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class RabbitServiceTest {

	@InjectMocks
	RabbitService rabbitService;
	
	@Mock
	RabbitRepo rabbitRepo;
	
	@Mock
	RabbitModel rabbit;
	
	@Test
	public void testRead_1()
		throws Exception {
		RabbitModel rabbitModel = new RabbitModel();
		rabbitModel.setName("test");
		Mockito.when(rabbitRepo.save(Mockito.isA(RabbitModel.class))).thenReturn(new RabbitModel());
		rabbitService.read(rabbitModel);
	}

	
	/**
	 * Run the void delete(RabbitModel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 7:26 PM
	 */
/*	@Test
	public void testDelete_1()
		throws Exception {
		rabbit.setName("");
		Mockito.doNothing().when(rabbitRepo).delete(Mockito.isA(String.class));
		rabbitService.delete(rabbit);
	}*/

	/**
	 * Run the void deleteAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 7:26 PM
	 */
	@Test
	public void testDeleteAll_1()
		throws Exception {

		Mockito.doNothing().when(rabbitRepo).deleteAll();
		rabbitService.deleteAll();
	}


	/*@Test(expected=NullPointerException.class)
	public void testGetAge_1()
		throws Exception {
		
		Mockito.when(rabbitRepo.findOne(Mockito.isA(String.class))).thenReturn(rabbit);
		int result = rabbitService.getAge(rabbit);
	}*/

	@Before
	public void setUp()
		throws Exception {
		MockitoAnnotations.initMocks(this);
		// add additional set up code here
	}

	
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RabbitServiceTest.class);
	}
}