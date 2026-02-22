package com.fing.app.controllers;

import java.util.ArrayList;

import com.fing.app.models.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainCtrl {
	
	
	
	@GetMapping("/")
	public String raiz(Model model){
		
		
		ArrayList<Order> lista= new ArrayList<>();
		
		lista.add(new Order());
	    lista.add(new Order());
	    lista.add(new Order());
	    lista.add(new Order());
	    lista.add(new Order());

	    model.addAttribute("ordenes", lista);
	    model.addAttribute("msg", "Hola");
	    
	    
	    //Nombre de usuario= stefanya saldaña 
	    //la parte junto a la foto
	    Order usuario = new Order();
	    usuario.setUsuario("Stefanya Saldaña");

	    model.addAttribute("usuarioNom", usuario.getUsuario());
        

		
		
		
		return "index";
	}
	
	
	
}



