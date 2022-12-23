package com.Dockerpro.real;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerproApplication {
    
	@GetMapping("/message")
	public String getMessage(){
    	return "Hi guys its just dummy";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(DockerproApplication.class, args);
	}

}
