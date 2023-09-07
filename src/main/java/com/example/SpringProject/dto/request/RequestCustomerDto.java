package com.example.SpringProject.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestCustomerDto {

    private String name;

    private String address;
    private double salary;

}
