package com.example.mongodbdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "customers")
public class Customer {

    @Id
    @JsonProperty
    private String id;
    @JsonProperty
    private String customerId;
    @JsonProperty
    private String name;
    @JsonProperty
    private String address;
}
