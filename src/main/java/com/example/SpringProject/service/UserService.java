package com.example.SpringProject.service;

import com.example.SpringProject.dto.request.RequestUserDto;

public interface UserService {

    public void createUser(RequestUserDto dto,String role);


}
