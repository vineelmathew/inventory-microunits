package com.dxctraining;

import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableMongoRepositories
public class SupplierMain {

	@Value("${spring.data.mongodb.database}")
	private String databaseName;

	public static void main(String[] args) {
		SpringApplication.run(SupplierMain.class, args);
	}

	@Bean
	public MongoTemplate mongoTemplate(MongoClient client){
		MongoTemplate template=new MongoTemplate(client,databaseName);
		return template;
	}


}
