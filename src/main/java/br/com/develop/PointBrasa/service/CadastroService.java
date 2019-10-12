package br.com.develop.PointBrasa.service;

import java.util.List;

import br.com.develop.PointBrasa.controller.form.ClienteForm;

public interface CadastroService {
	
	public boolean isValid(String date);

	List<String> cadastrarCliente(ClienteForm cliente);        

	
	
}
