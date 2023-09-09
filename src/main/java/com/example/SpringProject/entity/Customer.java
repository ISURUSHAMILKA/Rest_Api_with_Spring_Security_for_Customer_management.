package com.example.SpringProject.entity;


import com.example.SpringProject.entity.process.FileResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true,nullable = false)
    private long publicId;
    private String name;

    private String address;
    private double salary;

    @Column(columnDefinition = "TINYINT")
    private boolean activestate;

    @Embedded
    private FileResource fileResource;


}
