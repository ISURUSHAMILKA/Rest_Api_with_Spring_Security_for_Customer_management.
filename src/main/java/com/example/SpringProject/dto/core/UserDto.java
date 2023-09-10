package com.example.SpringProject.dto.core;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private String userId;
    private String email;
    private String fullName;

    private String password;
}
