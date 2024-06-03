package com.example.project3.pharmacy.repository;

import com.example.project3.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {

}
