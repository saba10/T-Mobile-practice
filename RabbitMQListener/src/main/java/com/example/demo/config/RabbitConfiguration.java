package com.example.demo.config;

import org.springframework.amqp.core.AmqpTemplate;

/*import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;*/



import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




import com.example.demo.service.RabbitService;

@Configuration
public class RabbitConfiguration {

	 public static final String ROUTING_KEY = "queue.two";
	 
	 @Bean
	 Queue queue() {
	  return new Queue(ROUTING_KEY, true);
	 }


	 @Bean
	 DirectExchange exchange() {
	  return new DirectExchange("exchange_two");
	 }


	 @Bean
	 Binding binding(Queue queue, DirectExchange directExchange) {
	  return BindingBuilder.bind(queue).to(directExchange).with(ROUTING_KEY);
	 }

	 @Bean
		public MessageConverter jsonMessageConverter() {
			return new Jackson2JsonMessageConverter();
		}
	 
	 @Bean
		public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
			final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
			rabbitTemplate.setMessageConverter(jsonMessageConverter());
			return rabbitTemplate;
		}

	/* @Bean
	 SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
	 MessageListenerAdapter listenerAdapter) {
	  SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
	  container.setConnectionFactory(connectionFactory);
	  container.setQueueNames(ROUTING_KEY);
	  container.setMessageListener(listenerAdapter);
	  return container;
	 }


	 @Bean
	 MessageListenerAdapter myQueueListener(RabbitService listener) {
	  return new MessageListenerAdapter(listener, "onMessage");
	 }*/
	}

