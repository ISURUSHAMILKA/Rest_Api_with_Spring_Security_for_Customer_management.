package com.example.SpringProject.api;

import com.example.SpringProject.db.Database;
import com.example.SpringProject.dto.core.CustomerDto;
import com.example.SpringProject.dto.request.RequestCustomerDto;
import com.example.SpringProject.dto.response.ResponseCustomerDto;
import com.example.SpringProject.util.StanderdResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

import static com.example.SpringProject.db.Database.customerTable;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {


    @PostMapping
    public ResponseEntity<StanderdResponse> createCustomer(@RequestBody RequestCustomerDto customerDto){

        var savedata= Database.createCustomer(customerDto);
        return new ResponseEntity<>(new StanderdResponse(

                201,"customer saved",savedata.toString()), HttpStatus.CREATED
        );


    }

    @GetMapping("/{id}")
    public ResponseEntity<StanderdResponse> findCustomer(@PathVariable int id) throws ClassNotFoundException {
        return new ResponseEntity<>(new StanderdResponse(

                200,"customer saved",Database.findCustomer(id)), HttpStatus.OK
        );

    }

    @PutMapping(params = "id")
    public ResponseEntity<StanderdResponse> updateCustomer(

            @RequestParam int id,
            @RequestBody RequestCustomerDto customerDto
    ) throws ClassNotFoundException {
        var savedata= Database.updateCustomer(customerDto,id);
        return new ResponseEntity<>(new StanderdResponse(

                201,"customer Updated",savedata), HttpStatus.CREATED
        );

    }


    @DeleteMapping(params = "id")
    public ResponseEntity<StanderdResponse> deleteCustomer(
            @RequestParam int id
    ) throws ClassNotFoundException {
        Database.deleteCustomer(id);
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

            200,"customer list",Database.searchAllCustomer(page, size, searchText)),
            HttpStatus.OK
    );

}















}
