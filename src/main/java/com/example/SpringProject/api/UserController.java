package com.example.SpringProject.api;


import com.example.SpringProject.dto.request.RequestUserDto;
import com.example.SpringProject.util.StanderdResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController {

    public ResponseEntity<StanderdResponse> createUser(@RequestBody RequestUserDto dto,
                                                       @RequestParam String role){

    }



}
