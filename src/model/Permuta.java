package model;

public class Permuta {
	private int codigo;
	private String nomecliente;
	private double saldocredito;
	private double valorcredito;
	private double valorpago;
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
	public double getValorcredito() {
		return valorcredito;
	}
	public void setValorcredito(double valorcredito) {
		this.valorcredito = valorcredito;
	}
	public double getValorpago() {
		return valorpago;
	}
	public void setValorpago(double valorpago) {
		this.valorpago = valorpago;
	}
	public double getSaldocredito() {
		return saldocredito;
	}
	public void setSaldocredito(double saldocredito) {
		this.saldocredito = saldocredito;
	}

}
