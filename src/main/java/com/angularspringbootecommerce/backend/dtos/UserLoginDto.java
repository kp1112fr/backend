package com.angularspringbootecommerce.backend.dtos;

import com.angularspringbootecommerce.backend.models.User;
import lombok.Getter;

@Getter
public class UserLoginDto {

    private Long id;
    private User user;
    private String jwt;

    public UserLoginDto() {
        super();
    }

    public UserLoginDto(Long id, User user, String jwt) {
        this.id = id;
        this.user = user;
        this.jwt = jwt;
    }

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
        this.id = id;
    }
	
}