package com.eventos.models;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Role{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
    private String nomeRole;
	
	
	public String getNomeRole() {
		return nomeRole;
	}


	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}


	

}
