package com.example.SpringProject.entity;


import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serial;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class UserRoleHashUserKey implements Serializable {

    @Column(length = 45,name = "user_id")
    private String userId;

    @Column(length = 45,name = "user_role")
    private String roleId;

}
