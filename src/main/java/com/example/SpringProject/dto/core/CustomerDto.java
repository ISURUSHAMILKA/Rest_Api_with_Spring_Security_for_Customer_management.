package com.example.SpringProject.dto.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto {
    private long id;

    private long publicId;
    private String name;

    private String address;
    private double salary;
    private boolean activestate;
    private Blob fileName;
    private Blob resourceUrl;
    private Blob directory;
    private Blob hash;


}
