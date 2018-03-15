package com.yryz.springcold.regist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class RegistApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

	@GetMapping(value = "/hi")
	public String hi(String name){
		return "hi," + name + " i am for port:" + port;
	}
}
