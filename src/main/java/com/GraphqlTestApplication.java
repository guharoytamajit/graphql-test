package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dao.SuperCharacterRepo;
import com.resolvers.MyQueryResolver;

@SpringBootApplication
public class GraphqlTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlTestApplication.class, args);
	}
	@Autowired
	SuperCharacterRepo superCharacterRepo;

	@Bean
	public MyQueryResolver query(){return new MyQueryResolver(superCharacterRepo);}

//	@Bean
//	public Mutation mutation(){return new Mutation(superCharacterRepo);}
}
