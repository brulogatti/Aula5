package java.br.com.proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Chocolate {

	public static final String QUERY_ALL = "Agenda.All";
	
	@Id
	@GeneratedValue
	private int id;
	
	private String descricao;
	private String tipo;
	
	private double porccacau;

	public Chocolate() {
	}

	public Chocolate(int id, String descricao, String tipo, double porccacau) {
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
		this.porccacau=porccacau;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPorccacau() {
		return porccacau;
	}

	public void setPorccacau(double porccacau) {
		this.porccacau = porccacau;
	}

	
	
}

