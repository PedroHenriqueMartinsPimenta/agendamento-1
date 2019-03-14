package br.com.israel.eeep.agendamento.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.israel.eeep.agendamento.model.User;
import br.com.israel.eeep.agendamento.model.Usuario;

@Controller
public class IndexController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String efetuaLogin(Usuario usuario, HttpSession session){
		return "home";		
	}
	
	
	/*
	//Para chamar o formulario de login
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm(){
		//Return uma página em html
		return "login";		
	}
	
	//Verificando as credenciais de login
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") User user, Model model){
		String usuario = user.getUsuario();
		String senha = user.getSenha();
		if("israel".equals(usuario) && "123".equals(senha)){
			return "home";
		}
		model.addAttribute("invalido", true);
		return "login";
	}*/

}
