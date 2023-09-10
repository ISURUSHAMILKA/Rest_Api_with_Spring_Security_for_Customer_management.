package com.example.SpringProject.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestUserDto {

    private String email;
    private String fullName;

    private String password;
}
