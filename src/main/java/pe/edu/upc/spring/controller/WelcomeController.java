package pe.edu.upc.spring.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	
	@RequestMapping("")
	public String irPaginaBienvenida(Model model) {
		return "bienvenido"; 
	}
	
	
	
}
