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
		
		lista.add(new Order(100));
	    lista.add(new Order(101));
	    lista.add(new Order(102));
	    lista.add(new Order(103));
	    lista.add(new Order(104));
	    lista.add(new Order(105));

	    model.addAttribute("ordenes", lista);
	    
	    
	    model.addAttribute("msg", "Proyecto con plantilla de AdminLTE3"); //titulo pag
	    
	    
	    //Nombre de usuario= stefanya saldaña 
	    //la parte junto a la foto
	    Order usuario = new Order();
	    usuario.setUsuario("Stefanya Saldaña");

	    model.addAttribute("usuarioNom", usuario.getUsuario());
        

		 
		
		
		return "index";
	}
	
	
	
}



