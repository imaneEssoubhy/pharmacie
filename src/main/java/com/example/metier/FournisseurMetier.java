package com.example.metier;

import java.util.List;

import com.example.entities.Fournisseur;

public interface FournisseurMetier  {
public Fournisseur saveFournisseur(Fournisseur f);
public List<Fournisseur> listFournisseur();
//public Fournisseur getFournisseur(Long id);

}
