package com.onlinepetconsultation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {

	
	@Size(min = 5, message = "Name should consist of at least 5 characters")
	@Pattern(regexp = "^[A-Za-z0-9@#$%&*]*$" ,message = "Invalid name format" )
	
	private String name;
	@Email
	@Pattern(regexp = "^[A-Za-z0-9@.]*$" ,message = "Invalid email format" )
	
	private String email;
	
	@Size(min = 3, message = "Password should consist of at least 3 characters")
	@Pattern(regexp = "^[A-Za-z0-9@#$%&*]*$" ,message = "Invalid password format" )
	private String password;
	
	private long phone;

}
