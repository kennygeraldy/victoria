package com.example.first_application.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Setter
@Getter
public class UpdateUserRequest {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;
}
