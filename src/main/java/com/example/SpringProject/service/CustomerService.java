package com.example.SpringProject.service;

import com.example.SpringProject.dto.request.RequestCustomerDto;
import com.example.SpringProject.dto.response.ResponseCustomerDto;
import com.example.SpringProject.dto.response.paginated.model.CustomerPaginatedDto;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    public ResponseCustomerDto createCustomer(RequestCustomerDto dto);

    public ResponseCustomerDto findCustomer(long id) throws ClassNotFoundException;

    public  ResponseCustomerDto updateCustomer(RequestCustomerDto dto,long id) throws ClassNotFoundException;

    public void deleteCustomer (long id);
    public  CustomerPaginatedDto searchAllCustomer(int page, int size, String searchText);




}
