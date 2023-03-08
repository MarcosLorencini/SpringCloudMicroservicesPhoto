package com.appsdeveloperblog.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//this will make this springboot a client which will be communicating with discovery servcer
@EnableDiscoveryClient // in newer versions, this annotation is no longer required
public class PhotoAppApiUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiUsersApplication.class, args);
	}

}
