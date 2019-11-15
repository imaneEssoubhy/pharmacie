package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.FactureClient;

public interface FactureClientRepository extends JpaRepository<FactureClient, Long>{

}
