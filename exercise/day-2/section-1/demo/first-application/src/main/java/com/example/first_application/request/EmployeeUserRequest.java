package com.example.first_application.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class EmployeeUserRequest {

    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty(value = "age", required = true)
    private int age;

    @JsonProperty(value = "address")
    private String address;

    @JsonProperty(value = "phone", required = true)
    private String phone;
}
