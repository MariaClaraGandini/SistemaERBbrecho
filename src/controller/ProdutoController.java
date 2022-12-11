package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.ProdutoDAO;
import model.Produto;

@Controller
public class ProdutoController {

	@GetMapping("/cadastrarproduto")
	public String cadastrarProduto() {
		return "cadastroproduto";
	}
	
	@PostMapping("/cadastrarproduto")
	public String cadastrarProdutoPost(HttpServletRequest req,
			Model model) {
		String descricao = req.getParameter("descricao");
		double quantidade = Double.parseDouble(req.getParameter("quantidade"));
		double valor = Double.parseDouble(req.getParameter("valor"));
		
		Produto p = new Produto();
		p.setDescricao(descricao);
		p.setQuantidade(quantidade);
		p.setValor(valor);
		
		ProdutoDAO dao = new ProdutoDAO();
		model.addAttribute("texto", dao.salvar(p));
		
		return "mensagem";
	}
	
	@GetMapping("/listarprodutos")
	public String listarProdutos(Model model) {
		ProdutoDAO dao = new ProdutoDAO();
		model.addAttribute("listaProdutos", dao.listarTodos());
		
		return "listagemproduto";
	}
	
	@GetMapping("/alterarproduto")
	public String alterarProduto(HttpServletRequest req,
			Model model) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ProdutoDAO dao = new ProdutoDAO();
		model.addAttribute("produto", dao.getProdutoPorCodigo(codigo));
		return "alteracaoproduto";
	}
	
	@PostMapping("/alterarproduto")
//	HTTPSEVLETREQUEST PEGA A REQUISIÇAO DA PAG, MODEL É PRA ACESSAR A CLASSE PRODUTO.
	public String alterarprodutoPost(HttpServletRequest req, Model model) {
	
	//LER DADOS DOS INPUTS
	int codigo = Integer.parseInt(req.getParameter("codigo"));
	String descricao = req.getParameter("descricao");
	double quantidade = Double.parseDouble(req.getParameter("quantidade"));
	double valor = Double.parseDouble(req.getParameter("valor"));
	
	Produto p = new Produto();
	//poderia tambem p.setCodigo(Integer.parseInt(req.getParameter("codigo"))
	p.setCodigo(codigo);
	p.setDescricao(descricao);
	p.setQuantidade(quantidade);
	p.setValor(valor);
	
	//criar um objeto DAO para gravar registro no banco
	
	ProdutoDAO dao = new ProdutoDAO();
	model.addAttribute("texto", dao.salvar(p));
	return "mensagem";
	
}
	@GetMapping("/excluirproduto")
	public String excluirProduto(HttpServletRequest req, Model model) {
		if(req.getParameter("codigo").equals("")){
			model.addAttribute("texto", "Informe o código!");
			/* Se codigo for vazio, ou seja, usuario n preencheu*/
			
		} else {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ProdutoDAO dao = new ProdutoDAO();
		model.addAttribute("texto", dao.excluir(codigo));
		}
		 return "mensagem";
	}
	
	@GetMapping("/pesquisarproduto")
	public String pesquisarproduto(HttpServletRequest req,
			Model model) {
		String descricao = req.getParameter("descricao");
		ProdutoDAO dao = new ProdutoDAO();
		model.addAttribute("listaProdutos", dao.getProdutoPorDescricao(descricao));
		return "listagemproduto";
	}
	
}
	
	

