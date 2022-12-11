package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import factory.Conexao;
import model.Avaliacao;

public class AvaliacaoDAO {
	private Connection con;
	
	public AvaliacaoDAO() {
		Conexao c = new Conexao();
		con = c.getConexao();
	}
	
	public String salvar(Avaliacao a) {
		String sql;
		//(a.getCodigo()>0) {
		//	sql = "UPDATE avaliacao SET nomecliente =?, dataavaliacao=? , itensaprovados=? , lucroliquido =?, valorcredito=? WHERE codigo =?"; 
		//} else {
		 sql = " INSERT INTO avaliacao(nomecliente,itensaprovados,data,lucroliquido, valorcredito) "+
					" VALUES (?,?,?,?,?) ";
		
		try {
			PreparedStatement as = con.prepareStatement(sql);
			as.setString(1, a.getNomecliente());
			as.setInt(2, a.getItensaprovados());
			as.setDate(3, java.sql.Date.valueOf(a.getData()));
			as.setDouble(4, a.getLucroliquido());
			as.setDouble (5, a.getValorcredito());
			
			//if(a.getCodigo() > 0) {
			//	as.setInt(5, a.getCodigo());
			//}
			as.execute();
			as.close();
			return "Avaliação gravado com êxito!";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Houve um erro! Tente novamente!"+ e.getMessage();
		} 
	}
	
	public List<Avaliacao> listarTodos() {
		List<Avaliacao> listaAvaliacoes = new ArrayList<>();
		String sql = " SELECT * FROM avaliacao " ;
		try {
			PreparedStatement as = con.prepareStatement(sql);
			ResultSet rs = as.executeQuery();
			while (rs.next()) {
				Avaliacao a = new Avaliacao();
				a.setCodigo(rs.getInt("codigo"));
				a.setNomecliente(rs.getString("nomecliente"));
				a.setItensaprovados(rs.getInt("itensaprovados"));
				a.setData(rs.getString("data"));
				a.setLucroliquido(rs.getDouble("lucroliquido"));
				a.setValorcredito(rs.getDouble("valorcredito"));
				listaAvaliacoes.add(a);
			}
			as.close();
			return listaAvaliacoes;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Avaliacao getAvaliacaoPorCodigo(int codigo) {
		String sql = " SELECT * FROM avaliacao "+
	                 " WHERE codigo = ? ";
		Avaliacao a = new Avaliacao();
		try {
			PreparedStatement as = con.prepareStatement(sql);
			as.setInt(1, codigo);
			ResultSet rs = as.executeQuery();
			if (rs.next()) {
				a.setCodigo(rs.getInt("codigo"));
				a.setNomecliente(rs.getString("nomecliente"));
				a.setItensaprovados(rs.getInt("itensaprovados"));
				a.setData(rs.getString("data"));
				a.setLucroliquido(rs.getDouble("lucroliquido"));
				a.setValorcredito(rs.getDouble("valorcredito"));
			}
			as.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public String excluir(int codigo) {
	
		String sql= "DELETE FROM avaliacao WHERE codigo =?";
		try {
			PreparedStatement as = this.con.prepareStatement(sql);
			as.setInt(1, codigo);
			as.execute();
			as.close();
			return "Avaliação excluída com êxito!";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Houve um erro!Tente novamente!";
		}
		
	}
	public List<Avaliacao> getAvaliacaoPorNome(String nomecliente) {
		List<Avaliacao> listaAvaliacoes = new ArrayList<>();
		String sql = " SELECT * FROM avaliacao "+
	                 " WHERE nomecliente LIKE ? ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%"+nomecliente+"%");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Avaliacao a = new Avaliacao();
				a.setCodigo(rs.getInt("codigo"));
				a.setNomecliente(rs.getString("nomecliente"));
				a.setItensaprovados(rs.getInt("itensaprovados"));
				a.setData(rs.getString("data"));
				a.setLucroliquido(rs.getDouble("lucroliquido"));
				a.setValorcredito(rs.getDouble("valorcredito"));
				listaAvaliacoes.add(a);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaAvaliacoes;
	}
}


