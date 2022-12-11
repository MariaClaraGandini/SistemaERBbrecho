package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.ClienteDAO;
import dao.PermutaDAO;
import model.Permuta;

@Controller
public class PermutaController {
	
	  @GetMapping("/cadastrarpermuta")
	    public String cadastraravaliacao() {
	        return "cadastropermuta";
	    }




@PostMapping("/cadastrarpermuta")
public String cadastrarPermutaPost(HttpServletRequest req,
		Model model) {
	String nomecliente = req.getParameter("nomecliente");
	System.out.println(req.getParameter("valorcredito").replace("R$", "").replace(",", ".").replaceAll(" ", ""));
	System.out.println(req.getParameter("saldocredito").replace("R$", "").replace(",", ".").replaceAll(" ", "").replace(" ", ""));
	System.out.println(req.getParameter("valorpago").replace("R$", "").replace(",", ".").replaceAll(" ", ""));
	
	double valorcredito = Double.parseDouble(req.getParameter("valorcredito").replace("R$", "").replace(",", ".").replaceAll(" ", ""));
	double saldocredito = Double.parseDouble(req.getParameter("saldocredito").replace("R$", "").replace(",", ".").replaceAll(" ", "").replace(" ", ""));	
	double valorpago = Double.parseDouble(req.getParameter("valorpago").replace("R$", "").replace(",", ".").replace(" ", "").replace("&nbsp;", ""));


	Permuta pe = new Permuta();
	pe.setNomecliente(nomecliente);
	pe.setValorcredito(valorcredito);
	pe.setSaldocredito(saldocredito);
	pe.setValorpago(valorpago);
	
	PermutaDAO dao = new PermutaDAO();
	model.addAttribute("texto", dao.salvar(pe));
	
	return "mensagem";
}

@GetMapping("/listarpermutas")
public String listarPermuta(Model model) {
	PermutaDAO dao = new PermutaDAO();
	model.addAttribute("listaPermuta", dao.listarTodos());
	
	return "listagempermuta";
}

@GetMapping("/excluirpermuta")
public String excluirPermuta(HttpServletRequest req, Model model) {
	if(req.getParameter("codigo").equals("")){
		model.addAttribute("texto", "Informe o código!");
		/* Se codigo for vazio, ou seja, usuario n preencheu*/
		
	} else {
	int codigo = Integer.parseInt(req.getParameter("codigo"));
	PermutaDAO dao = new PermutaDAO();
	model.addAttribute("texto", dao.excluir(codigo));
	}
	 return "mensagem";
}

}
