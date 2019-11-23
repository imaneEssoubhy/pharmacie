package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class FactureFournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="CODE_FOUNISSEUR")
	private Fournisseur fournisseur;
	private int totale;
	 
	@OneToMany(mappedBy="factureFournisseur",fetch=FetchType.LAZY)
	private Collection<MedicamentItem>medicamentItems;
	
	public FactureFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FactureFournisseur(Long id, Fournisseur fournisseur, int totale, Collection<MedicamentItem> medicamentItems) {
		super();
		this.id = id;
		this.fournisseur = fournisseur;
		this.totale = totale;
		this.medicamentItems = medicamentItems;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public int getTotale() {
		return totale;
	}
	public void setTotale(int totale) {
		this.totale = totale;
	}
	public Collection<MedicamentItem> getMedicamentItems() {
		return medicamentItems;
	}
	public void setMedicamentItems(Collection<MedicamentItem> medicamentItems) {
		this.medicamentItems = medicamentItems;
	}
	
}
