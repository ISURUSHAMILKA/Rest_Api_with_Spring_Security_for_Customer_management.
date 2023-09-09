package com.example.SpringProject.api;

import com.example.SpringProject.dto.request.RequestCustomerDto;
import com.example.SpringProject.service.CustomerService;
import com.example.SpringProject.util.StanderdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping
    public ResponseEntity<StanderdResponse> createCustomer(@RequestBody RequestCustomerDto customerDto){


        return new ResponseEntity<>(new StanderdResponse(

                201,"customer saved",customerService.createCustomer(customerDto)), HttpStatus.CREATED
        );


    }

    @GetMapping("/{id}")
    public ResponseEntity<StanderdResponse> findCustomer(@PathVariable long id) throws ClassNotFoundException {
        return new ResponseEntity<>(new StanderdResponse(

                200,"customer saved",customerService.findCustomer(id)), HttpStatus.OK
        );

    }

    @PutMapping(params = "id")
    public ResponseEntity<StanderdResponse> updateCustomer(

            @RequestParam int id,
            @RequestBody RequestCustomerDto customerDto
    ) throws ClassNotFoundException {

        return new ResponseEntity<>(new StanderdResponse(

                201,"customer Updated",customerService.updateCustomer(customerDto,id)), HttpStatus.CREATED
        );
    }


    @DeleteMapping(params = "id")
    public ResponseEntity<StanderdResponse> deleteCustomer(
            @RequestParam int id
    ) throws ClassNotFoundException {
        customerService.deleteCustomer(id);

        return new ResponseEntity<>(new StanderdResponse(

                204,"customer deleted!",null), HttpStatus.NO_CONTENT
        );


    }

public ResponseEntity<StanderdResponse> getAllCustomers(
        @RequestParam int page,
        @RequestParam int size,
        @RequestParam String searchText
) throws ClassNotFoundException {
    return new ResponseEntity<>(
            new StanderdResponse(

            200,"customer list",customerService.searchAllCustomer(page, size, searchText)),
            HttpStatus.OK
    );

}















}
