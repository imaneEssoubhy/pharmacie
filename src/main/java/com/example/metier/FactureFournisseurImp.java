package com.example.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.FactureFournisseurRepository;
import com.example.entities.FactureFournisseur;
@Service
public class FactureFournisseurImp implements FactureFournisseurMetier{
private FactureFournisseurRepository factureFournisseurRepository;
	@Override
	public FactureFournisseur saveFactureFournisseur(FactureFournisseur f) {
		// TODO Auto-generated method stub
		return factureFournisseurRepository.save(f);
	}

	@Override
	public List<FactureFournisseur> listFactureFournisseurs() {
		// TODO Auto-generated method stub
		return factureFournisseurRepository.findAll();
	}

	 
}
