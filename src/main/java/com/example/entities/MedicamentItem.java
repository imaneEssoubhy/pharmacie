package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class MedicamentItem implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="CODE_MEDICMENT")
	private Medicament medicament;
//	@ManyToOne
//	@JoinColumn(name="CODE_FCLT")
//	private FactureClient factureClient;
	@ManyToOne
	@JoinColumn(name="CODE_FFOURNISSEUR")
	private FactureFournisseur factureFournisseur;
	private int qte;
	
	public MedicamentItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MedicamentItem(int id, Medicament medicament, int qte) {
		super();
		this.id = id;
		this.medicament = medicament;
		this.qte = qte;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Medicament getMedicament() {
		return medicament;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	

}
