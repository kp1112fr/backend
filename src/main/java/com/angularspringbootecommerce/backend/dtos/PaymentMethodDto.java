package com.angularspringbootecommerce.backend.dtos;

import lombok.Data;

@Data
public class PaymentMethodDto {
    private String type;
    private CardDto card;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public CardDto getCard() {
		return card;
	}
	public void setCard(CardDto card) {
		this.card = card;
	}
    
}
