  package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private Connection con;
	private String driver ="com.mysql.jdbc.Driver";
	private String url ="jdbc:mysql://localhost/projetosql";
	private String usuario ="root";
	private String senha = "";
	public Conexao() {
		try {
			Class.forName(driver);
			con= DriverManager.getConnection(url, usuario,senha);
		} catch (ClassNotFoundException | SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConexao() {
		return con;
	}
}


