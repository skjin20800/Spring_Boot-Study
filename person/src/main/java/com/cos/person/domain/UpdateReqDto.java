package com.cos.person.domain;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class UpdateReqDto {
	
	@NotBlank
	private String password; 
	private String phone;
}
