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
 * @generatedBy CodePro at 7/9/18 12:35 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class RabbitConfigurationTest {
	/**
	 * Run the RabbitConfiguration() constructor test.
	 *
	 * @generatedBy CodePro at 7/9/18 12:35 PM
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
	 * @generatedBy CodePro at 7/9/18 12:35 PM
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
	 * @generatedBy CodePro at 7/9/18 12:35 PM
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
		assertEquals(true, result.isDurable());
		assertEquals(false, result.isAutoDelete());
		assertEquals(false, result.isDelayed());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	/**
	 * Run the MessageConverter jsonMessageConverter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 12:35 PM
	 */
	@Test
	public void testJsonMessageConverter_1()
		throws Exception {
		RabbitConfiguration fixture = new RabbitConfiguration();

		MessageConverter result = fixture.jsonMessageConverter();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.logging.log4j.util.PropertiesUtil
		//       at org.apache.logging.log4j.status.StatusLogger.<clinit>(StatusLogger.java:71)
		//       at org.apache.logging.log4j.LogManager.<clinit>(LogManager.java:60)
		//       at org.apache.commons.logging.LogFactory$Log4jLog.<clinit>(LogFactory.java:199)
		//       at org.apache.commons.logging.LogFactory$Log4jDelegate.createLog(LogFactory.java:166)
		//       at org.apache.commons.logging.LogFactory.getLog(LogFactory.java:109)
		//       at org.apache.commons.logging.LogFactory.getLog(LogFactory.java:99)
		//       at org.springframework.amqp.support.converter.Jackson2JsonMessageConverter.<clinit>(Jackson2JsonMessageConverter.java:48)
		//       at com.example.demo.config.RabbitConfiguration.jsonMessageConverter(RabbitConfiguration.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the Queue queue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 12:35 PM
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
		assertEquals(false, result.isExclusive());
		assertEquals(null, result.getArguments());
		assertEquals(true, result.isDurable());
		assertEquals(false, result.isAutoDelete());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	/**
	 * Run the AmqpTemplate rabbitTemplate(ConnectionFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 12:35 PM
	 */
	@Test
	public void testRabbitTemplate_1()
		throws Exception {
		RabbitConfiguration fixture = new RabbitConfiguration();
		ConnectionFactory connectionFactory = new CachingConnectionFactory();

		AmqpTemplate result = fixture.rabbitTemplate(connectionFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.commons.logging.LogFactory$Log4jLog
		//       at org.apache.commons.logging.LogFactory$Log4jDelegate.createLog(LogFactory.java:166)
		//       at org.apache.commons.logging.LogFactory.getLog(LogFactory.java:109)
		//       at org.apache.commons.logging.LogFactory.getLog(LogFactory.java:99)
		//       at org.springframework.amqp.rabbit.connection.AbstractConnectionFactory.<init>(AbstractConnectionFactory.java:72)
		//       at org.springframework.amqp.rabbit.connection.CachingConnectionFactory.<init>(CachingConnectionFactory.java:206)
		//       at org.springframework.amqp.rabbit.connection.CachingConnectionFactory.<init>(CachingConnectionFactory.java:187)
		//       at org.springframework.amqp.rabbit.connection.CachingConnectionFactory.<init>(CachingConnectionFactory.java:179)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 12:35 PM
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
	 * @generatedBy CodePro at 7/9/18 12:35 PM
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
	 * @generatedBy CodePro at 7/9/18 12:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RabbitConfigurationTest.class);
	}
}