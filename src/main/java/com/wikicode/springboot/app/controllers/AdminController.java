package com.wikicode.springboot.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wikicode.springboot.app.models.service.IEmployerService;
import com.wikicode.springboot.app.models.table.OrderTableField;
import com.wikicode.springboot.app.models.entity.Menu;
import com.wikicode.springboot.app.models.entity.Order;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private IEmployerService employerService;
	
	@GetMapping("/orders")
	public String admin(Model model) {

		List<Order> allOrders = employerService.findAllOrders();
		List<OrderTableField> OrdersTable = new ArrayList<>();
		
		for (Order i : allOrders) {
			
			Menu menu = i.getMenu();
			
			OrderTableField orderTableField = new OrderTableField(i.getID(), menu.getMain(), menu.getSide(), menu.getDrink(), i.getIdentifier());
			
			OrdersTable.add(orderTableField);
		}
		
		model.addAttribute("orders", OrdersTable);
		
		return "ordersview";
		
	}
}