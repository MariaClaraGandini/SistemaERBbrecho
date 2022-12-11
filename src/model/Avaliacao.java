package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Avaliacao {
	private int codigo;
	private String nomecliente;
	private String data;
	private int itensaprovados;
	private double lucroliquido;
	private double valorcredito;
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}



	public int getItensaprovados() {
		return itensaprovados;
	}

	public void setItensaprovados(int itensaprovados) {
		this.itensaprovados = itensaprovados;
	}

	public double getLucroliquido() {
		return lucroliquido;
	}

	public void setLucroliquido(double lucroliquido) {
		this.lucroliquido = lucroliquido;
	}

	public double getValorcredito() {
		return valorcredito;
	}

	public void setValorcredito(double valorcredito) {
		this.valorcredito = valorcredito;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDataBr() {
	    String pattern = "dd/MM/yyyy";
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	    Date dataAux = new Date();
	    try {
			dataAux = new SimpleDateFormat("yyyy-MM-dd").parse(this.data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    return simpleDateFormat.format(dataAux);		
	}
	
}
