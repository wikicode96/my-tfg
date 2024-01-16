package com.wikicode.springboot.app.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wikicode.springboot.app.model.entity.Menu;
import com.wikicode.springboot.app.model.entity.Order;
import com.wikicode.springboot.app.service.IClienteService;

@Controller
public class ClienteController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/menus")
	public String list(Model model) {	
		model.addAttribute("menus", clienteService.findAll());
		return "menus";
	}
	
	@PostMapping("/seleccionar-menu")
	public String seleccionarMenu(Model model, @RequestParam("menuID") int menuID) {
		model.addAttribute("menu", clienteService.findOne(menuID));
		return "pedido";
	}
	
	@PostMapping("/peticion-aceptada")
	public String peticionAceptada(Model model, @RequestParam("menuID") int menuID) {
		
		Random random = new Random();
	    char letra = (char)(random.nextInt(26) + 'A');
	    int numero = random.nextInt(10000);
	    String clientID = String.format("%c%d", letra, numero);
	    
	    Order newOrder = new Order();
	    Menu menu = new Menu();
	    
	    menu.setId(menuID);
	    newOrder.setIdentifier(clientID);
	    newOrder.setMenu(menu);
	    
	    clienteService.saveOrder(newOrder);
	    
	    model.addAttribute("clientID", clientID);
	    
		return "aceptado";
	}
}