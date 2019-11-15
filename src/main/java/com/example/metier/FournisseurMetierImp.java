package com.example.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.FournisseurRepository;
import com.example.entities.Fournisseur;
@Service
public class FournisseurMetierImp implements FournisseurMetier {
	@Autowired
    private  FournisseurRepository fournisseurRepository;
	@Override
	public Fournisseur saveFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
		return fournisseurRepository.save(f);
	}
  
	@Override
	public List<Fournisseur> listFournisseur() {
		// TODO Auto-generated method stub
		return fournisseurRepository.findAll();
	}

	//@Override
//	public Fournisseur getFournisseur(Long id) {
		// TODO Auto-generated method stub
	//	return fournisseurRepository.getOne(id);
	//}

}
