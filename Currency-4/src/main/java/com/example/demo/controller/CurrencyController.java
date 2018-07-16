package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.CurrencyEntity;
import com.example.demo.repository.CurrencyRepository;

@RestController
public class CurrencyController {
	
	@Autowired
	private CurrencyRepository currencyRepository;
	
	
	@RequestMapping("/one")
	public String m1() {
		return "hello";
	}
	
	
	
	@PostMapping("/save")
	public CurrencyEntity m2(@RequestBody CurrencyEntity currencyEntity) {
		//CurrencyEntity currencyEntity=new CurrencyEntity();
		//currencyEntity.setName(name);
		currencyRepository.save(currencyEntity);
		return currencyEntity;
	}
	
	@RequestMapping("/API")
	public Object m3() {
		RestTemplate restTemplate=new RestTemplate();
		Object obj= restTemplate.getForObject("http://www.apilayer.net/api/live?access_key=f480fdaf37dc1de2bf261780cb66684c", Object.class);
		CurrencyEntity currencyEntity=new CurrencyEntity();
		//currencyEntity.setObject(obj);
		return obj;
	}

}
