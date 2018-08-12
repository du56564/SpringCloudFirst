package com.bofa.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bofa.microservices.currencyexchangeservice.bean.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);
}
