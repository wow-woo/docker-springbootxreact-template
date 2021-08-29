package com.ais.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BackendApplication {
	@GetMapping("/")
	public String hello(){
		return "여기는 관리자 페이지 입니다.";
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/yourname")
	public String name(){
		return "Hong, gil-dong";
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
