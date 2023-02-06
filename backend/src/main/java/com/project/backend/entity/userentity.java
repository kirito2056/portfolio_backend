package com.project.backend.entity;

import jakarta.persistence.*;
import org.springframework.boot.convert.DataSizeUnit;

@Entity
@Table(name = "Account")
public class userentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @Column(length = 64)
    private String identity;


}