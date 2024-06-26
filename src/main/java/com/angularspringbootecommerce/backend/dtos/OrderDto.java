package com.angularspringbootecommerce.backend.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDto {
    private Long id;
    private String dateCreated;
    private BigDecimal total;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
    
}