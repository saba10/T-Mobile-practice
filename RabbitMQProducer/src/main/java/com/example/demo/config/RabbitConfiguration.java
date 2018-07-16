package com.example.demo.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactoryUtils;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitConfiguration {
	
	 public static final String ROUTING_KEY = "queue.two";
	 
	 @Bean
	 Queue queue()
	 {
		 return new Queue(ROUTING_KEY,true);
	 }
	 
	 @Bean
	 DirectExchange exchange()
	 {
		 return new DirectExchange("exchange_two"); 
	 }
	 
	 @Bean
	 Binding binding( Queue queue, DirectExchange directExchange)
	 {
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

}
