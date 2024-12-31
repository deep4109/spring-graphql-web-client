package com.example.spring_graphql_web_client;

import com.fasterxml.jackson.databind.ObjectMapper;
import graphql.kickstart.spring.webclient.boot.GraphQLWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringGraphqlWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphqlWebClientApplication.class, args);
	}

	@Bean
	public GraphQLWebClient graphQLWebClient() {
		ObjectMapper objectMapper = new ObjectMapper();

		WebClient webClient = WebClient.builder()
				.baseUrl("http://localhost:8080/student-service")
				.build();

		return GraphQLWebClient.newInstance(webClient, objectMapper);
	}

}
