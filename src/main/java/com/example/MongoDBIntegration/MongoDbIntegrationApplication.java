package com.example.MongoDBIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
public class MongoDbIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbIntegrationApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}


}

// Eleven Labs API Key :- sk_ba5c4b03277d51a7c5cd044d645eecabc1b86fcdbd6523e4

//MongoDB Atlas
//chaitanyavaidya
//X0Q1B6hKcdKkVndN

//Connection String
//mongodb+srv://chaitanyavaidya:<db_password>@cluster0.eanbs.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0
