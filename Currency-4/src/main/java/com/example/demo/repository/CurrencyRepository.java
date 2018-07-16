package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CurrencyEntity;

public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Integer>{

}
