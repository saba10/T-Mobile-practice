package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RabbitModel;
import com.example.demo.service.RabbitService;

@RestController
public class RabbitController {

	@Autowired
	RabbitService rabbitService;
	
	@Autowired
	RabbitModel rabbitmodel;
	
	@GetMapping("/deleteAll")
	public void deleteAll() {
		rabbitService.deleteAll();	
	}
	
	/*@GetMapping("/delete")
	public void delete(@RequestParam String name) {
		rabbitmodel.setName("a2");
		rabbitService.delete(rabbitmodel);	
	}
	

	@GetMapping("/getAge")
	public int getAge(@RequestParam String name) {
		rabbitmodel.setName("a2");
		int a=rabbitService.getAge(rabbitmodel);
		return a;
	}*/
}
