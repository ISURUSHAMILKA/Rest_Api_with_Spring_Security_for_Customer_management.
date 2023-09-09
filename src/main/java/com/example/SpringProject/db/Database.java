package com.example.SpringProject.db;

import com.example.SpringProject.dto.core.CustomerDto;
import com.example.SpringProject.dto.request.RequestCustomerDto;
import com.example.SpringProject.dto.response.ResponseCustomerDto;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Optional;
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
                true,
                null,
                null,
                null,
                null

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


    public static ResponseCustomerDto findCustomer(int id) throws ClassNotFoundException {

        Optional<CustomerDto>  selectedCustomer = customerTable.stream().filter(e->e.getPublicId()==id).findFirst();
            if(selectedCustomer.isPresent()){
                return new ResponseCustomerDto(
                        selectedCustomer.get().getPublicId(),
                        selectedCustomer.get().getName(),
                        selectedCustomer.get().getAddress(),
                        selectedCustomer.get().getSalary(),
                        selectedCustomer.get().isActivestate()
                );
            }else {
                throw new ClassNotFoundException();
            }


    }

    public static ResponseCustomerDto updateCustomer(RequestCustomerDto dto,int id) throws ClassNotFoundException {

        Optional<CustomerDto>  selectedCustomer = customerTable.stream().filter(e->e.getPublicId()==id).findFirst();

        if(selectedCustomer.isPresent()){
                    selectedCustomer.get().setName(dto.getName());
                    selectedCustomer.get().setAddress(dto.getAddress());
                    selectedCustomer.get().setSalary(dto.getSalary());


            return new ResponseCustomerDto(
                    selectedCustomer.get().getPublicId(),
                    selectedCustomer.get().getName(),
                    selectedCustomer.get().getAddress(),
                    selectedCustomer.get().getSalary(),
                    selectedCustomer.get().isActivestate()
            );

        }else {
            throw new ClassNotFoundException();
        }





    }


}
