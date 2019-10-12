package br.com.develop.PointBrasa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.develop.PointBrasa.controller.form.ClienteForm;
import br.com.develop.PointBrasa.service.CadastroService;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {
	
	@Autowired
	private CadastroService cadastroServ;
	
	@PostMapping("/cadastrar")
	public String cadastrar(@RequestParam ClienteForm cliente, RedirectAttributes attr) {
		List<String> erros = cadastroServ.cadastrarCliente(cliente);
		if(erros != null) {
			attr.addFlashAttribute("erros", erros); 
			return "redirect:/cadastro";
		}
		attr.addFlashAttribute("success","Cadastro realizado com sucesso!" );
		return "redirect:/cadastro";
	}
	
	
}
