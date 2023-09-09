package com.example.SpringProject.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseCustomerDto {



    private long publicId;
    private String name;

    private String address;
    private double salary;
    private boolean activestate;
}
