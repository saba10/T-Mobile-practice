package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMethod;

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
		if(!(currencyRepository.existsById(currencyEntity.getId())))
		{
		currencyRepository.save(currencyEntity);
		}
		return currencyEntity;
	}
	
	@PutMapping("/update")
	public CurrencyEntity m3(@RequestBody CurrencyEntity currencyEntity) {
		//CurrencyEntity currencyEntity=new CurrencyEntity();
		//currencyEntity.setName(name);
		currencyRepository.save(currencyEntity);
		return currencyEntity;
	}
	
	@RequestMapping(value="/delete/{id}", method= RequestMethod.DELETE)
	public String m3(@PathVariable int id) {
		//CurrencyEntity currencyEntity=new CurrencyEntity();
		//currencyEntity.setName(name);
		currencyRepository.deleteById(id);
		return "deleted";
	}
	
	
	@RequestMapping(value="/get/{id}", method= RequestMethod.GET)
	public Optional<CurrencyEntity> m4(@PathVariable int id) {
		//CurrencyEntity currencyEntity=new CurrencyEntity();
		//currencyEntity.setName(name);
		Optional<CurrencyEntity> entity=currencyRepository.findById(id);
		return entity;
	}

}
