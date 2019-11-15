package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class FactureClient implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int totale;
//	@OneToMany(mappedBy="factureClient ",fetch=FetchType.LAZY)
//	private Collection<MedicamentItem>medicamentItems;
	
	public FactureClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FactureClient(int id, int totale, Collection<MedicamentItem> medicamentItems) {
		super();
		this.id = id;
		this.totale = totale;
//		this.medicamentItems = medicamentItems;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotale() {
		return totale;
	}

	public void setTotale(int totale) {
		this.totale = totale;
	}

//	public Collection<MedicamentItem> getMedicamentItems() {
//		return medicamentItems;
//	}
//
//	public void setMedicamentItems(Collection<MedicamentItem> medicamentItems) {
//		this.medicamentItems = medicamentItems;
//	}
	
	
	 
	
}
