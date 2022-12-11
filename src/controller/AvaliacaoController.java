package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.AvaliacaoDAO;
import dao.ProdutoDAO;
import model.Avaliacao;

@Controller
public class AvaliacaoController {
	
	  @GetMapping("/cadastraravaliacao")
	    public String cadastraravaliacao() {
	        return "cadastroavaliacao";
	    }

	  @PostMapping("/cadastraravaliacao")
		public String cadastrarAvaliacaoPost(HttpServletRequest req,
				Model model) {
			String nomecliente = req.getParameter("nomecliente");
			int itensaprovados = Integer.parseInt(req.getParameter("itensaprovados"));
			String data = req.getParameter("data");
			double lucroliquido = Double.parseDouble(req.getParameter("lucroliquido"));
			double valorcredito = Double.parseDouble(req.getParameter("valorcredito"));
			
			Avaliacao a = new Avaliacao();
			a.setNomecliente(nomecliente);
			a.setItensaprovados(itensaprovados);
			a.setData(data);
			a.setLucroliquido(lucroliquido);
			a.setValorcredito(valorcredito);
			AvaliacaoDAO dao = new AvaliacaoDAO();
			model.addAttribute("texto", dao.salvar(a));
			
			return "mensagem";
		}
	  
	  @GetMapping("/listaravaliacoes")
		public String listarAvaliacoes(Model model) {
			AvaliacaoDAO dao = new AvaliacaoDAO();
			model.addAttribute("listaAvaliacoes", dao.listarTodos());
			
			return "listagemavaliacao";
		}
	  
	  @GetMapping("/excluiravaliacao")
		public String excluirAvaliacao(HttpServletRequest req, Model model) {
			if(req.getParameter("codigo").equals("")){
				model.addAttribute("texto", "Informe o código!");
				
			} else {
			int codigo = Integer.parseInt(req.getParameter("codigo"));
			AvaliacaoDAO dao = new AvaliacaoDAO();
			model.addAttribute("texto", dao.excluir(codigo));
			}
			 return "mensagem";
		}
	  
	  @GetMapping("/pesquisaravaliacao")
		public String pesquisaravaliacao(HttpServletRequest req,
				Model model) {
			String nomecliente = req.getParameter("nomecliente");
			AvaliacaoDAO dao = new AvaliacaoDAO();
			model.addAttribute("listaAvaliacao", dao.getAvaliacaoPorNome(nomecliente));
			return "listagemavaliacao";
		}
		
}
