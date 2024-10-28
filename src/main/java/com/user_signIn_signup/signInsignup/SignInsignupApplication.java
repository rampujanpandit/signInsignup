package com.user_signIn_signup.signInsignup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = "com.user_signIn_signup.signInsignup.models")
public class SignInsignupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignInsignupApplication.class, args);
		System.out.println("-------------------------------------");
	}

}
