package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import factory.Conexao;
import model.Permuta;

public class PermutaDAO {
		private Connection con;
		
		public PermutaDAO() {
			Conexao c = new Conexao();
			con = c.getConexao();
		}
		
		public String salvar(Permuta pe) {
			String sql;
			//(a.getCodigo()>0) {
			//	sql = "UPDATE avaliacao SET nomecliente =?, dataavaliacao=? , itensaprovados=? , lucroliquido =?, valorcredito=? WHERE codigo =?"; 
			//} else {
			 sql = " INSERT INTO permuta(nomecliente,valorcredito,saldocredito,valorpago) "+
						" VALUES (?,?,?,?) ";
			
			try {
				PreparedStatement per = con.prepareStatement(sql);
				per.setString(1, pe.getNomecliente());
				per.setDouble(2, pe.getValorcredito());
				per.setDouble(3, pe.getSaldocredito());
				per.setDouble(4, pe.getValorpago());
				
				//if(a.getCodigo() > 0) {
				//	as.setInt(5, a.getCodigo());
				//}
				per.execute();
				per.close();
				return "Permuta gravado com êxito!";
			} catch (SQLException e) {
				e.printStackTrace();
				return "Houve um erro! Tente novamente!"+ e.getMessage();
			} 
		}
		public List<Permuta> listarTodos() {
			List<Permuta> listaPermuta = new ArrayList<>();
			String sql = " SELECT * FROM permuta ";
			try {
				PreparedStatement pes = con.prepareStatement(sql);
				ResultSet rs = pes.executeQuery();
				while (rs.next()) {
					Permuta pe = new Permuta();
					pe.setCodigo(rs.getInt("codigo"));
					pe.setNomecliente(rs.getString("nomecliente"));
					pe.setValorcredito(rs.getDouble("valorcredito"));
					pe.setSaldocredito(rs.getDouble("saldocredito"));
					pe.setValorpago(rs.getDouble("valorpago"));
					listaPermuta.add(pe);
				}
				pes.close();
				return listaPermuta;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public Permuta getPermutaPorCodigo(int codigo) {
			String sql = " SELECT * FROM permuta "+
		                 " WHERE codigo = ? ";
			Permuta pe = new Permuta();
			try {
				PreparedStatement pes = con.prepareStatement(sql);
				pes.setInt(1, codigo);
				ResultSet rs = pes.executeQuery();
				if (rs.next()) {
					pe.setCodigo(rs.getInt("codigo"));
					pe.setNomecliente(rs.getString("nomecliente"));
					pe.setValorcredito(rs.getDouble("valorcredito"));
					pe.setSaldocredito(rs.getDouble("saldocredito"));
					pe.setValorpago(rs.getDouble("valorpago"));
				}
				pes.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return pe;
		}
		public String excluir(int codigo) {
		
			String sql= "DELETE FROM permuta WHERE codigo =?";
			try {
				PreparedStatement ps = this.con.prepareStatement(sql);
				ps.setInt(1, codigo);
				ps.execute();
				ps.close();
				return "Permuta excluído com êxito!";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "Houve um erro!Tente novamente!";
			}
			
		}
}
