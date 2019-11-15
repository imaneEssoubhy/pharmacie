package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Medicament;

public interface MedicamentRepository extends JpaRepository<Medicament, Long>{

}
