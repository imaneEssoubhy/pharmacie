package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.MedicamentItem;

public interface MedicamentItemsRepoository extends JpaRepository<MedicamentItem,Long> {

}
