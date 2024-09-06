package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping
	public ArrayList<GetAssetResponse> getAsset() {

		ArrayList<GetAssetResponse> List = new ArrayList<>();
		var response = GetAssetResponse.builder().id(1L).fullName("Kenny Geraldy Chandra").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build();
		var response1 = GetAssetResponse.builder().id(2L).fullName("John Doe").umur(23).gender("Laki-Laki").address("Jl. Kintamani No.3").build();
		var response2 = GetAssetResponse.builder().id(3L).fullName("James Bond").umur(26).gender("Laki-Laki").address("Jl. Kintamani No.5").build();
		var response3 = GetAssetResponse.builder().id(4L).fullName("Kapti").umur(13).gender("Laki-Laki").address("Jl. Kintamani No.6").build();
		var response4 = GetAssetResponse.builder().id(5L).fullName("Kurniawan").umur(21).gender("Laki-Laki").address("Jl. Kintamani No.7").build();

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

//	@GetMapping("/assets/{id}")
//	public List<GetAssetResponse> getAssetById(
//			@PathVariable Long id
//	){
//
//		List<GetAssetResponse> asset = new ArrayList<>();
//		asset.add(GetAssetResponse.builder().id(1L).fullName("Kenny Geraldy Chandra").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build());
//		asset.add(GetAssetResponse.builder().id(2L).fullName("Chandra").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build());
//		asset.add(GetAssetResponse.builder().id(3L).fullName("James Bond").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build());
//		asset.add(GetAssetResponse.builder().id(4L).fullName("Cherry Jiam").umur(22).gender("Perempuan").address("Jl. Kintamani No.2").build());
//		asset.add(GetAssetResponse.builder().id(5L).fullName("Jomos").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build());
//		return GetAssetResponse.builder().id(id).fullName(fullName).build();

//		for (GetAssetResponse getAssetResponse : asset){
//			if(id.equals(getAssetResponse.getId())) {
//				return getAssetResponse;
//			}
//		}
//		return null;

//		List<GetAssetResponse> tempAsset = new ArrayList<>();
//
//		for (GetAssetResponse getAssetResponse : asset){
//			if(getAssetResponse.getId() >= id) {
//				tempAsset.add(getAssetResponse);
//			}
//		}
//		return tempAsset;
//	}

	@GetMapping("/assets")
	public List<GetAssetResponse> getAssetById(
			@RequestParam(name = "page", required = false, defaultValue = "1") int page,
			@RequestParam(name = "size", required = false, defaultValue = "3") int size
	) {

		List<GetAssetResponse> asset = new ArrayList<>();
		asset.add(GetAssetResponse.builder().id(1L).fullName("Kenny Geraldy Chandra").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build());
		asset.add(GetAssetResponse.builder().id(2L).fullName("Chandra").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build());
		asset.add(GetAssetResponse.builder().id(3L).fullName("James Bond").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build());
		asset.add(GetAssetResponse.builder().id(4L).fullName("Cherry Jiam").umur(22).gender("Perempuan").address("Jl. Kintamani No.2").build());
		asset.add(GetAssetResponse.builder().id(5L).fullName("Jomos").umur(22).gender("Laki-Laki").address("Jl. Kintamani No.2").build());

		int start = (page - 1) * size;
		int end = Math.min(start + size, asset.size());

		if (start >= asset.size()) {
			return new ArrayList<>();
		}

		return asset.subList(start, end);
	}



//	@GetMapping("calculator/add")
//	public String getAdd(
//			@RequestParam(name = "panjang") int panjang,
//			@RequestParam(name = "lebar", required = false, defaultValue = "20") int lebar
//	){
//		return String.valueOf(panjang+lebar);
//	}

//	@GetMapping
//	public String sayHello(){
//		return "Hello World";
//	}

//	@GetMapping("/users")
//	public List<String> getUser(){
//		return List.of("John","Jane","Jack");
//	}
}
