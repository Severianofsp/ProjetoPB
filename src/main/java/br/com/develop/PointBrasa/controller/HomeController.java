package br.com.develop.PointBrasa.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.develop.PointBrasa.controller.form.ClienteForm;
import br.com.develop.PointBrasa.entity.Cliente;

@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {
		return "/home/home";
	}
	
	@GetMapping("/cadastro")
	public String cadastro(Model model, ClienteForm cliente) {
		
		model.addAttribute("cliente",cliente);
		return "/cadastro/cadastroCliente";		
	}
	
	
	@GetMapping("/listaCadastro")
	@ResponseBody
	public List<Cliente> listaCadastro() {
		List<Cliente> clientes = null;
		return clientes;
	}
	
}
