package com.example.project3.pharmacy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "pharmacy")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pharmacyAddress;
    private String pharmacyName;
    private double latitude;
    private double longitude;
}
