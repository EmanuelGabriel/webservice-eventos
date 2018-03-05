package com.eventos.models;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Users{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String nome;
	
	private String senha;
	
	@OneToMany(fetch=FetchType.EAGER)
    private List<Role> roles = new ArrayList<Role>();

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		System.out.println(senha);
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
}
