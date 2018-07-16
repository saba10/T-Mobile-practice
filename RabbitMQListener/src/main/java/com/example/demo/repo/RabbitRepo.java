package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.example.demo.model.RabbitModel;

public interface RabbitRepo extends JpaRepository<RabbitModel, String>{
	

}
