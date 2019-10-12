package br.com.develop.PointBrasa.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.develop.PointBrasa.controller.form.ClienteForm;
import br.com.develop.PointBrasa.repository.ClienteRepository;
import br.com.develop.PointBrasa.service.CadastroService;

@Service
public class CadastroServiceImpl implements CadastroService{
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@Override
	public boolean isValid(String date) { 
		String format = "dd/MM/yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);     
		dateFormat.setLenient(false);                                   
		try {                                                           
			dateFormat.parse(date);                                     
			return true;                                                
		} catch (ParseException e) {                                    
			return false;                                               
		}                                                               
	}  
	
	@Override
	public List<String> cadastrarCliente(ClienteForm cliente) {
		List<String> erros = new ArrayList<String>();
		
		String dataRecebida = cliente.getDataNascimento();
		if(!isValid(dataRecebida)){
			erros.add("Data inexistente.");
		}
		try {
			Date dataAtual = new Date();
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			Date dataForm = fmt.parse(cliente.getDataNascimento());
			if(dataForm.compareTo(dataAtual) < 18) {
				erros.add("Para concluir o cadastro, você precisa ter mais de 18 anos.");
			}
		} catch (ParseException e) {
			erros.add(null);
		}
//		String loginexistente = clienteRepo.findByLogin(cliente.getLogin());
//		if(!loginexistente.isEmpty()) {
//			erros.add("Login existente.");
//		}
		
		return erros;
	}
	
	
	
	
}
