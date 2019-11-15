package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Medicament implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private Date dateProduction;
	private Date dateEXP;
	@ManyToOne
	@JoinColumn(name="CODE_FOUNISSEUR")
	private Fournisseur fournisseur;
	private int qteStock;
	private int minimumStock;
	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicament(int id, String libelle, Date dateProduction, Date dateEXP, Fournisseur fournisseur, int qteStock,
			int minimumStock) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.dateProduction = dateProduction;
		this.dateEXP = dateEXP;
		this.fournisseur = fournisseur;
		this.qteStock = qteStock;
		this.minimumStock = minimumStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Date getDateProduction() {
		return dateProduction;
	}
	public void setDateProduction(Date dateProduction) {
		this.dateProduction = dateProduction;
	}
	public Date getDateEXP() {
		return dateEXP;
	}
	public void setDateEXP(Date dateEXP) {
		this.dateEXP = dateEXP;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	public int getMinimumStock() {
		return minimumStock;
	}
	public void setMinimumStock(int minimumStock) {
		this.minimumStock = minimumStock;
	}
	

}
