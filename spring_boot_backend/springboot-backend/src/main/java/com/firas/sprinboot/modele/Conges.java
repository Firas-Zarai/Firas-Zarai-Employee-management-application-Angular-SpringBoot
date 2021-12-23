package com.firas.sprinboot.modele;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Conges")
public class Conges {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="Date_debut")
	private String datedebut;
	
	@Column(name ="Date_fin")
	private String datefin;




	@Column(name ="employee")
    private String employee;




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getDatedebut() {
		return datedebut;
	}




	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}




	public String getDatefin() {
		return datefin;
	}




	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}




	public String getEmployee() {
		return employee;
	}




	public void setEmployee(String employee) {
		this.employee = employee;
	}

	
	
	

}
