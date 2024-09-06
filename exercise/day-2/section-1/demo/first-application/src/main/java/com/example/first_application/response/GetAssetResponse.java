package com.example.first_application.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class GetAssetResponse {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("umur")
    private int umur;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("address")
    private String address;

}
