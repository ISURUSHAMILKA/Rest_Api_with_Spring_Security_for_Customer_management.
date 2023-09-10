package com.example.SpringProject.service.impl;

import com.example.SpringProject.dto.request.RequestUserDto;
import com.example.SpringProject.repo.UserRepo;
import com.example.SpringProject.repo.UserRoleRepo;
import com.example.SpringProject.service.UserService;

public class UserServiceImpl implements UserService {


    private final UserRepo userRepo;

    private final UserRoleRepo userRoleRepo;


    public UserServiceImpl( UserRepo userRepo, UserRoleRepo userRoleRepo) {
        this.userRepo = userRepo;

        this.userRoleRepo = userRoleRepo;
    }


    @Override
    public void createUser(RequestUserDto dto, String role) {

        var selectedUserRole=userRoleRepo.findByRoleName(role);
        if (selectedUserRole.isEmpty()){
            throw new RuntimeException(("user role not found"));

        }else {
            var selectedUser=userRepo.findUserByEmail(dto.getEmail());

            if (selectedUser.isEmpty()){
                throw new RuntimeException(("user role not found"));

            }


        }

    }
}
