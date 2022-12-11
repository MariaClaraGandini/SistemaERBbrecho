package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import factory.Conexao;
import model.Cliente;

public class ClienteDAO {
    private Connection con;
    
    public ClienteDAO() {
    	Conexao c = new Conexao();
    	con = c.getConexao();
    } 
    
    public String salvar(Cliente c) {
    	String sql;
		if(c.getCodigo()>0) {
			sql = "UPDATE cliente SET nome =?, cpf=? , email=?, telefone=?, celular=?, option =?, cep=?, uf=?, cidade=?, rua=?, numero=?, bairro=? WHERE codigo =?"; 
		} else {
			
    	sql = "INSERT INTO cliente(nome,cpf,email, telefone, celular, option, cep, uf, cidade, rua, numero,  bairro)" +
                      "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		}
    	try {
    	
			PreparedStatement cs = con.prepareStatement(sql);
			cs.setString(1, c.getNome());
			cs.setString(2, c.getCpf());
			cs.setString(3, c.getEmail());
			cs.setString(4, c.getTelefone());
			cs.setString(5, c.getCelular());
			cs.setString(6, c.getOption());
			cs.setInt(7, c.getCep());
			cs.setString(8, c.getUf());
			cs.setString(9, c.getCidade());
			cs.setString(10, c.getRua());
			cs.setString(11, c.getNumero());
			cs.setString(12, c.getBairro());
			if(c.getCodigo() > 0) {
				cs.setInt(13, c.getCodigo());
			}
			cs.execute();
			cs.close();
			return "Cliente salvo com Êxito";
		} catch (SQLException e) {
			e.printStackTrace();
			return"Houve um erro! Tente novamente"+ e.getMessage();
		}
    }
    
    public List<Cliente> listarTodos(){
    	
    	List<Cliente> listaClientes = new ArrayList<>();
    	String sql = "SELECT * FROM cliente";
    	try {
    		
			PreparedStatement cs = con.prepareStatement(sql);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				
				Cliente c = new Cliente();
				c.setCodigo(rs.getInt("codigo"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
				c.setCelular(rs.getString("celular"));
				c.setOption(rs.getString("option"));
				c.setCep(rs.getInt("cep"));
				c.setUf(rs.getString("uf"));
				c.setCidade(rs.getString("cidade"));
				c.setRua(rs.getString("rua"));
				c.setNumero(rs.getString("numero"));
				c.setBairro(rs.getString("bairro"));

				listaClientes.add(c);
				
			}
			cs.close();
			return listaClientes;
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			return null;
			
		}
    	
    }
    
    public Cliente getClientePorCodigo(int codigo) {
    	String sql = " SELECT * FROM cliente " + " WHERE codigo = ?";
    	Cliente c = new Cliente();
    	try {
			PreparedStatement cs = con.prepareStatement(sql);
			cs.setInt(1, codigo);
			ResultSet rs = cs.executeQuery();
			if (rs.next()) {
				c.setCodigo(rs.getInt("codigo"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
				c.setCelular(rs.getString("celular"));
				c.setOption(rs.getString("option"));
				c.setCep(rs.getInt("cep"));
				c.setUf(rs.getString("uf"));
				c.setCidade(rs.getString("cidade"));
				c.setRua(rs.getString("rua"));
				c.setNumero(rs.getString("numero"));
				c.setBairro(rs.getString("bairro"));
			};
			cs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return c;
    }
    public String excluir(int codigo) {
    	
		String sql= "DELETE FROM cliente WHERE codigo =?";
		try {
			PreparedStatement cs = this.con.prepareStatement(sql);
			cs.setInt(1, codigo);
			cs.execute();
			cs.close();
			return "cliente excluído com êxito!";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Houve um erro!Tente novamente!";
		}
		
	}
    public List<Cliente> getClientePorNome(String nome) {
		List<Cliente> listaClientes = new ArrayList<>();
		String sql = " SELECT * FROM cliente "+
	                 " WHERE nome LIKE ? ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%"+nome+"%");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Cliente c = new Cliente();
				c.setCodigo(rs.getInt("codigo"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
				c.setCelular(rs.getString("celular"));
				c.setOption(rs.getString("option"));
				c.setCep(rs.getInt("cep"));
				c.setUf(rs.getString("uf"));
				c.setCidade(rs.getString("cidade"));
				c.setRua(rs.getString("rua"));
				c.setNumero(rs.getString("numero"));
				c.setBairro(rs.getString("bairro"));
				listaClientes.add(c);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaClientes;
	}
}
