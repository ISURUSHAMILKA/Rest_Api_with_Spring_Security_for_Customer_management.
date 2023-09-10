package com.example.SpringProject.service.impl;

import com.example.SpringProject.entity.UserRole;
import com.example.SpringProject.repo.UserRoleRepo;
import com.example.SpringProject.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    private final UserRoleRepo userRoleRepo;
    @Autowired
    public UserRoleServiceImpl(UserRoleRepo userRoleRepo) {
        this.userRoleRepo = userRoleRepo;
    }


    @Override
    public void initializeRoles() {


        if (  userRoleRepo.findAll().isEmpty()){

            UserRole admin =new UserRole("POS-R-1","ADMIN","admin desc",null);
            UserRole user =new UserRole("POS-R-2","USER","user desc",null);
            UserRole manager =new UserRole("POS-R-3","MANAGER","manager desc",null);

        userRoleRepo.saveAll(List.of(admin,user,manager));
        }

    }
}
