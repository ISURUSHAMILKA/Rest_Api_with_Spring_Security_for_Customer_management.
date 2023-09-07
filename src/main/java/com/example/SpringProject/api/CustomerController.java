package com.example.SpringProject.api;

import com.example.SpringProject.db.Database;
import com.example.SpringProject.dto.request.RequestCustomerDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    public String createCustomer(@RequestBody RequestCustomerDto customerDto){


        return Database.createCustomer(customerDto).toString();

    }





}
