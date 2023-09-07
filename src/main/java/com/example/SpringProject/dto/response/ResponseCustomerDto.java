package com.example.SpringProject.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseCustomerDto {



    private long publicId;
    private String name;

    private String address;
    private double salary;
    private boolean activestate;
}
