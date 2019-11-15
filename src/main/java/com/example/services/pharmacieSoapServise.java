package com.example.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.FournisseurRepository;
import com.example.entities.Fournisseur;
import com.example.metier.FournisseurMetier;
@Component
@WebService
public class pharmacieSoapServise {
	@Autowired
public FournisseurMetier fournisseurMetier;
@WebMethod
	public List<Fournisseur> listFournisseur() {
		return fournisseurMetier.listFournisseur();
	}
	
}
