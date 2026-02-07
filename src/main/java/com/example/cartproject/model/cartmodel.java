package com.example.cartproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class cartmodel {

    private Integer id;

    @JsonProperty("productname")
    private String productname;
    private int price;
    private String description;

}
