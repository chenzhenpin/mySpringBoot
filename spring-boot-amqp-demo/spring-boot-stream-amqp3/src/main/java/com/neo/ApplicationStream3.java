package com.neo;

import com.neo.stream.QueService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(QueService.class)
@SpringBootApplication
public class ApplicationStream3 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStream3.class, args);
	}
}
