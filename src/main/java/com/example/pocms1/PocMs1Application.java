package com.example.pocms1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
public class PocMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(PocMs1Application.class, args);
	}

}
