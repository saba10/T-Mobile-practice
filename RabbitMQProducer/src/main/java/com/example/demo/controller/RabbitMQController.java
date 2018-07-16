package com.example.demo.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.RabbitMQService;
import com.example.demo.model.RabbitModel;

@RestController
public class RabbitMQController {
	
	@Autowired
	private RabbitMQService rabbitMQService;
	
	@RequestMapping("/read")
	public String read() throws Exception
	{
		ArrayList<RabbitModel> arrayList = rabbitMQService.read();
		for (RabbitModel rabbitModel : arrayList) {
			rabbitMQService.testSend2(rabbitModel);
		}
		return "read success";
	}
	
	/*@RequestMapping("/objecttest")
	public RabbitModel test(@RequestParam String m1, @RequestParam String m2) {
		
		RabbitModel rabbitModel=new RabbitModel();
		rabbitModel.setName(m1);
		rabbitModel.setAge(m2);
		rabbitMQService.testSend2(rabbitModel);
		
		return rabbitModel;
	}
	
	@RequestMapping("/test")
	public String test(@RequestParam String message) {
		rabbitMQService.testSend(message);
		return message;
	}
	*/
}
