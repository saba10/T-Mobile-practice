package com.example.demo.config;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.MessageConverter;

/**
 * The class <code>RabbitConfigurationTest</code> contains tests for the class <code>{@link RabbitConfiguration}</code>.
 *
 * @generatedBy CodePro at 7/10/18 6:16 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class RabbitConfigurationTest {
	/**
	 * Run the RabbitConfiguration() constructor test.
	 *
	 * @generatedBy CodePro at 7/10/18 6:16 PM
	 */
	@Test
	public void testRabbitConfiguration_1()
		throws Exception {
		RabbitConfiguration result = new RabbitConfiguration();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Binding binding(Queue,DirectExchange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 6:16 PM
	 */
	@Test
	public void testBinding_1()
		throws Exception {
		RabbitConfiguration fixture = new RabbitConfiguration();
		Queue queue = new Queue("");
		DirectExchange directExchange = new DirectExchange("");

		Binding result = fixture.binding(queue, directExchange);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Binding [destination=, exchange=, routingKey=queue.two]", result.toString());
		assertEquals("", result.getDestination());
		assertEquals("", result.getExchange());
		assertEquals("queue.two", result.getRoutingKey());
		assertEquals(true, result.isDestinationQueue());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	/**
	 * Run the DirectExchange exchange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 6:16 PM
	 */
	@Test
	public void testExchange_1()
		throws Exception {
		RabbitConfiguration fixture = new RabbitConfiguration();

		DirectExchange result = fixture.exchange();

		// add additional test code here
		assertNotNull(result);
		assertEquals("direct", result.getType());
		assertEquals("Exchange [name=exchange_two, type=direct, durable=true, autoDelete=false, internal=false, arguments={}]", result.toString());
		assertEquals("exchange_two", result.getName());
		assertEquals(false, result.isInternal());
		assertEquals(false, result.isDelayed());
		assertEquals(false, result.isAutoDelete());
		assertEquals(true, result.isDurable());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	/**
	 * Run the MessageConverter jsonMessageConverter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 6:16 PM
	 */
	@Test
	public void testJsonMessageConverter_1()
		throws Exception {
		RabbitConfiguration fixture = new RabbitConfiguration();

		MessageConverter result = fixture.jsonMessageConverter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Queue queue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 6:16 PM
	 */
	@Test
	public void testQueue_1()
		throws Exception {
		RabbitConfiguration fixture = new RabbitConfiguration();

		Queue result = fixture.queue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Queue [name=queue.two, durable=true, autoDelete=false, exclusive=false, arguments=null]", result.toString());
		assertEquals("queue.two", result.getName());
		assertEquals(null, result.getArguments());
		assertEquals(false, result.isExclusive());
		assertEquals(false, result.isAutoDelete());
		assertEquals(true, result.isDurable());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	/**
	 * Run the AmqpTemplate rabbitTemplate(ConnectionFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 6:16 PM
	 */
	@Test
	public void testRabbitTemplate_1()
		throws Exception {
		RabbitConfiguration fixture = new RabbitConfiguration();
		ConnectionFactory connectionFactory = new CachingConnectionFactory();

		AmqpTemplate result = fixture.rabbitTemplate(connectionFactory);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 6:16 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 6:16 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 7/10/18 6:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RabbitConfigurationTest.class);
	}
}