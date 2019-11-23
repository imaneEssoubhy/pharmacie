package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.FactureFournisseur;
 import com.example.metier.FactureFournisseurMetier;
 @RestController
public class FactureFournisseurRest {
	@Autowired
	private FactureFournisseurMetier factureFournisseurMetier;
	@RequestMapping(value="/factureFournisseurs",method=RequestMethod.POST)
		public FactureFournisseur saveFactureFournisseur(@RequestBody FactureFournisseur f) {
			return factureFournisseurMetier.saveFactureFournisseur(f) ;
		}
	@RequestMapping(value="/factureFournisseurs",method=RequestMethod.GET)
		public List<FactureFournisseur> listFactureFournisseur() {
			return factureFournisseurMetier.listFactureFournisseurs(); 
		}
}
