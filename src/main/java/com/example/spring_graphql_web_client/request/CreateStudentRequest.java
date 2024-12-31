package com.example.spring_graphql_web_client.request;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateStudentRequest {

	private String firstName;

	private String lastName;

	private String email;

	private String street;

	private String city;

	private List<CreateSubjectRequest> subjectsLearning;

}
