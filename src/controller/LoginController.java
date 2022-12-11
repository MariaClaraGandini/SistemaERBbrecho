//package controller;

//import java.sql.SQLException;

//import javax.servlet.http.HttpServletRequest;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;

//import dao.UsuarioDAO;

//@Controller
//public class LoginController {

/*   @GetMapping("/login")
    public String login() {
        return "login";
    }
   
   @PostMapping("/login")
	public String LoginPost(HttpServletRequest req,Model model) throws SQLException {
	   
		
		
		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");	
		

		boolean existe = UsuarioDAO.autenticarusuario(usuario,senha);
		
		if(existe) {
			return "/index";
		} else {
			return "mensagem";
		}
	}

}*/
