package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Assessment2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Assessment2Application.class, args);
		
		
		StorageService storage = context.getBean(StorageService.class);
		storage.storeFile("data.txt");
		StorageService local1 = context.getBean("localStorage",StorageService.class);
		local1.storeFile("file1.txt");
		
		StorageService local2 = context.getBean("localStorage",StorageService.class);
		local2.storeFile("file2.txt");
		context.close();
	}
}