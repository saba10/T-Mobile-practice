package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.config.RabbitConfiguration;
import com.example.demo.model.RabbitModel;
import com.example.demo.repo.RabbitRepo;

@Service
public class RabbitService {
	@Autowired
	private RabbitRepo rabbitRepo;
	
	/*public void onMessage(ArrayList<String> message)
	{
		for (String string : message) {
			
		System.out.println("Message Received:"+string);
		}
	}*/
	/*
	public void onMessage(String message)
	{	
		System.out.println("Message Received:"+message);
		
	}
	*/
	
	@RabbitListener(queues = RabbitConfiguration.ROUTING_KEY )
	public void read(RabbitModel rabbitModel)
	{
		System.out.println(rabbitModel.getAge());
		rabbitRepo.save(rabbitModel);
	}
	
	public void deleteAll()
	{
		rabbitRepo.deleteAll();
	}
	
	/*public void delete(RabbitModel rabbit)
	{
		rabbitRepo.delete(rabbit.getName());
	}
	
	public int getAge(RabbitModel rabbit)
	{
		RabbitModel rabbitModel = rabbitRepo.findOne(rabbit.getName());
		return rabbitModel.getAge();
	}
	*/
	/*public void update(String name)
	{
		rabbitRepo.save(name);
	}*/

}
