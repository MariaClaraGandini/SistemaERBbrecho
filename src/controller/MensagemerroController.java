package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MensagemerroController {

	@GetMapping("/mensagemerro")
	public String mensagem(Model model) {
		model.addAttribute("texto", "Bem-vindo!");
		return "mensagemerro";
		//retorna a rota, mensagem.jsp
	}
}
