package com.deltasource.eu.articlesrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class ArticlesRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticlesRestApplication.class, args);
	}

}
