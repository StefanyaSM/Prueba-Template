package com.fing.app.controllers;

import java.util.ArrayList;

import com.fing.app.models.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainCtrl {

	
	
	
	
	
	
	
	
	
	

	
	
	
	@GetMapping("/p")
	public String raiz(Model model){
		
		ArrayList<Order> lista= new ArrayList<>();
		lista.add(new Order());
		lista.add(new Order());
		lista.add(new Order());
		lista.add(new Order());
		lista.add(new Order());
		
		
		model.addAttribute("Ordenes", lista);
		Order o1= new Order();
		

		
		
		model.addAttribute("msg", "Hola");
		return "index";
	}
	
	
	
}
