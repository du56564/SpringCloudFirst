package com.bofa.microservices.currencyconversionservice.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalulatedAmount;
	private int port;
	
	public CurrencyConversionBean() {}
	
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple,BigDecimal quantity,BigDecimal totalCalulatedAmount,
			int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalulatedAmount=totalCalulatedAmount;
		this.port = port;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	
	public BigDecimal getTotalCalulatedAmount() {
		return totalCalulatedAmount;
	}

	public void setTotalCalulatedAmount(BigDecimal totalCalulatedAmount) {
		this.totalCalulatedAmount = totalCalulatedAmount;
	}

	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}

