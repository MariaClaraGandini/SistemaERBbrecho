package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.ClienteDAO;
import model.Cliente;

@Controller
public class ClienteController {
	@GetMapping("/cadastrarcliente")
	public String cadastrarCliente() {
		return "cadastrocliente";
	}
	
	@PostMapping("/cadastrarcliente")
	public String cadastrarClientePost(HttpServletRequest req,Model model) {
		
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
		String telefone = req.getParameter("telefone");
		String celular = req.getParameter("celular");
		String option = req.getParameter("option");
		int cep = Integer.parseInt(req.getParameter("cep"));
		String uf = req.getParameter("uf");
		String cidade = req.getParameter("cidade");
		String rua = req.getParameter("rua");
		String numero = req.getParameter("numero");
		String bairro = req.getParameter("bairro");

		Cliente c = new Cliente();
		c.setNome(nome);
		c.setCpf(cpf);
		c.setEmail(email);
		c.setTelefone(telefone);
		c.setCelular(celular);
		c.setOption(option);
		c.setCep(cep);
		c.setUf(uf);
		c.setCidade(cidade);
		c.setRua(rua);
		c.setNumero(numero);
		c.setBairro(bairro);

		ClienteDAO dao = new ClienteDAO();
		model.addAttribute("texto", dao.salvar(c));
		
		return "mensagem";
		
	}
	
	
	@GetMapping("/listarclientes")
	public String listarClientes(Model model) {
		ClienteDAO dao = new ClienteDAO();
		model.addAttribute("listaClientes", dao.listarTodos());
		
		return "listagemcliente";
	}
	
	@GetMapping("/alterarcliente")
	public String alterarCliente(HttpServletRequest req,
			Model model) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ClienteDAO dao = new ClienteDAO();
		model.addAttribute("cliente", dao.getClientePorCodigo(codigo));
		return "alteracaocliente";
	}
	
	@PostMapping("/alterarcliente")
//	HTTPSEVLETREQUEST PEGA A REQUISIÇAO DA PAG, MODEL É PRA ACESSAR A CLASSE PRODUTO.
	public String alterarprodutoPost(HttpServletRequest req, Model model) {
	
	//LER DADOS DOS INPUTS
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String email = req.getParameter("email");
		String telefone = req.getParameter("telefone");
		String celular = req.getParameter("celular");
		String option = req.getParameter("option");
		int cep = Integer.parseInt(req.getParameter("cep"));
		String uf = req.getParameter("uf");
		String cidade = req.getParameter("cidade");
		String rua = req.getParameter("rua");
		String numero = req.getParameter("numero");
		String bairro = req.getParameter("bairro");

		Cliente c = new Cliente();
		c.setCodigo(codigo);
		c.setNome(nome);
		c.setCpf(cpf);
		c.setEmail(email);
		c.setTelefone(telefone);
		c.setCelular(celular);
		c.setOption(option);
		c.setCep(cep);
		c.setUf(uf);
		c.setCidade(cidade);
		c.setRua(rua);
		c.setNumero(numero);
		c.setBairro(bairro);

		ClienteDAO dao = new ClienteDAO();
		model.addAttribute("texto", dao.salvar(c));
	return "mensagem";
	
	//criar um objeto DAO para gravar registro no banco
	
	}
	

	@GetMapping("/excluircliente")
	public String excluirCliente(HttpServletRequest req, Model model) {
		if(req.getParameter("codigo").equals("")){
			model.addAttribute("texto", "Informe o código!");
			/* Se codigo for vazio, ou seja, usuario n preencheu*/
			
		} else {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ClienteDAO dao = new ClienteDAO();
		model.addAttribute("texto", dao.excluir(codigo));
		}
		 return "mensagem";
	}
	
	@GetMapping("/pesquisarcliente")
	public String pesquisarcliente(HttpServletRequest req,
			Model model) {
		String nome = req.getParameter("nome");
		ClienteDAO dao = new ClienteDAO();
		model.addAttribute("listaCliente", dao.getClientePorNome(nome));
		return "listagemCliente";
	}
	
}
	
	


