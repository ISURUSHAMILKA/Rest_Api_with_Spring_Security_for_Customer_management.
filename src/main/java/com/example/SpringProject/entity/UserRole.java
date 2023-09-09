package com.example.SpringProject.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_role")
public class UserRole {

    @Id
    @Column(name = "role_id",length = 45)
    private String roleId;

    @Column(name = "role_name" ,length = 45,unique = true)
    private String roleName;
    @Column(name = "description" ,length = 250)
    private String description;





}