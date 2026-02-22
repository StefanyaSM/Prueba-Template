package com.fing.app.controllers;

import java.util.ArrayList;

import com.fing.app.models.Order;
import com.fing.app.models.BRate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainCtrl {
	
	
	
	@GetMapping("/")
	public String raiz(Model model){
		
	    model.addAttribute("msg", "Proyecto con plantilla de AdminLTE3"); //titulo pag


	    //Nombre de usuario= stefanya saldaña 
	    //la parte junto a la foto
	    Order usuario = new Order();
	    usuario.setUsuario("Stefanya Saldaña");

	    model.addAttribute("usuarioNom", usuario.getUsuario());
        

	    //cuadro azul
		ArrayList<Order> lista= new ArrayList<>();
		
		lista.add(new Order(100));
	    lista.add(new Order(101));
	    lista.add(new Order(102));
	    lista.add(new Order(103));
	    lista.add(new Order(104));
	    lista.add(new Order(105));

	    model.addAttribute("ordenes", lista);
	    
	    
	    
	    //cuadro verde
	    ArrayList<BRate> lista2= new ArrayList<>();
	    
	    lista2.add(new BRate("No funciona"));
	    lista2.add(new BRate("No funciona"));
	    lista2.add(new BRate("Funciona"));
	    lista2.add(new BRate("Funciona"));
	    lista2.add(new BRate("No funciona"));

        int positivos = 0;
        
        for (BRate b : lista2) { //recorre lista 2 y cuenta los positivos
            if ("Funciona".equalsIgnoreCase(b.getEstado())) {
                positivos++;
            }
        }
        
        int porcentajeFinal = (int) Math.round((positivos * 100.0) / lista2.size());

        model.addAttribute("brate", porcentajeFinal);
        model.addAttribute("listaBRate", lista2);
	    
	    
	    
	    
		 
		
		
		return "index";
	}
	
	
	
}



