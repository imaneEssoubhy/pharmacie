package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

}
