package br.com.develop.PointBrasa.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "pb_clientes")
public class Cliente {
	
	@Id
	@GeneratedValue
	@Column(name = "pk_id")
	private long id;
	
	@Column(name = "tx_name_full")
	private String nome;
	
	@Column(name = "tx_login")
	private String login;
	
	@Column(name = "nb_tel_1")
	private int telefone1;
	
	@Column(name = "nb_tel_2")
	private int telefone2;
	
	@Column(name = "date_birth")
	private Date dataNascimento;
	
	@Column(name = "password")
	private String senha;

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTelefone1() {
		return telefone1;
	}


	public void setTelefone1(int telefone1) {
		this.telefone1 = telefone1;
	}

	public int getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(int telefone2) {
		this.telefone2 = telefone2;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
