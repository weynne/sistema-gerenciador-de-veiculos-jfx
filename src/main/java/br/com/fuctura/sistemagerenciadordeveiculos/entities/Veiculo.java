package br.com.fuctura.sistemagerenciadordeveiculos.entities;

import java.io.Serializable;
import java.util.Objects;

public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String placa;
	private String modelo;
	private Integer ano;
	private Double valor;

	public Veiculo() {

	}

	public Veiculo(Long id, String placa, String modelo, Integer ano, Double valor) {
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + ", valor=" + valor
				+ "]";
	}

}
