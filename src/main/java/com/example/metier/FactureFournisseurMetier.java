package com.example.metier;

import java.util.List;

import com.example.entities.FactureFournisseur;
import com.example.entities.Fournisseur;

 

public interface FactureFournisseurMetier {
	public FactureFournisseur saveFactureFournisseur(FactureFournisseur f);
	public List<FactureFournisseur>listFactureFournisseurs();
	 
}
