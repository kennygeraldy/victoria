package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping
	public ArrayList<GetAssetResponse> sayHello(){

		ArrayList<GetAssetResponse> List = new ArrayList<>();
		var response = GetAssetResponse.builder().id(1L).fullName("Kenny Geraldy Chandra").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build();
		var response1 = GetAssetResponse.builder().id(2L).fullName("John Doe").umur(23).gender("Laki-Laki").address("Jl. Kintamani No.3").build();

		response.setFullName("KENNY G");

		List.add(response);
		List.add(response1);
		return List;

//		var response = GetAssetResponse.builder().id(1L).fullName("Kenny Geraldy Chandra").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build();
//
//		response.setFullName("KENNY G");
//
//		response.getFullName();
//		response.getUmur();
//		response.getGender();
//		response.getAddress();
//
//		return response;
	}


//	@GetMapping
//	public String sayHello(){
//		return "Hello World";
//	}

//	@GetMapping("/users")
//	public List<String> getUser(){
//		return List.of("John","Jane","Jack");
//	}
}
