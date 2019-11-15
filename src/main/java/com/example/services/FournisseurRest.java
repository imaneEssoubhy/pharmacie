package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Fournisseur;
import com.example.metier.FournisseurMetier;

@RestController
public class FournisseurRest {
	@Autowired
private FournisseurMetier fournisseurMetier;
@RequestMapping(value="/fournisseurs",method=RequestMethod.POST)
	public Fournisseur saveFournisseur(@RequestBody Fournisseur f) {
		return fournisseurMetier.saveFournisseur(f);
	}
@RequestMapping(value="/fournisseurs",method=RequestMethod.GET)
	public List<Fournisseur> listFournisseur() {
		return fournisseurMetier.listFournisseur();
	}
//@RequestMapping(value="/fournisseurs/{id}",method=RequestMethod.GET)
//public Fournisseur getFournisseur(@PathVariable Long id) {
//	return fournisseurMetier.getFournisseur(id);
// }

 


}
