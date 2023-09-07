package com.example.SpringProject.db;

import com.example.SpringProject.dto.core.CustomerDto;
import com.example.SpringProject.dto.request.RequestCustomerDto;
import com.example.SpringProject.dto.response.ResponseCustomerDto;

import java.util.ArrayList;
import java.util.Random;

public class Database {


    public static ArrayList<CustomerDto> customerTable =new ArrayList<>();

    public static ResponseCustomerDto createCustomer(RequestCustomerDto dto){
        CustomerDto customerDto=new CustomerDto(
                new Random().nextInt(100001),
                new Random().nextInt(100001),
                dto.getName(),
                dto.getAddress(),
                dto.getSalary(),
                true

        );

    customerTable.add(customerDto);
    return new ResponseCustomerDto(
            customerDto.getPublicId(),
            dto.getName(),
            dto.getAddress(),
            dto.getSalary(),
            customerDto.isActivestate()
    );


    }

}
