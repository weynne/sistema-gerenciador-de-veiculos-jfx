package br.com.fuctura.sistemagerenciadordeveiculos.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.fuctura.sistemagerenciadordeveiculos.entities.Veiculo;

public class VeiculoService implements Serializable {
	private static final long serialVersionUID = 1L;

	public List<Veiculo> findAll() {
		List<Veiculo> list = new ArrayList<Veiculo>();
		list.add(new Veiculo(1L, "RZU-5D56", "HONDA XRE-300", 2023, 27500.55));
		list.add(new Veiculo(2L, "PUY-0499", "FORD KA SEDAN 1.5", 2014, 35000.00));
		list.add(new Veiculo(3L, "PGQ-1835", "TOYOTA COROLLA XEI 2.0", 2014, 60000.99));
				
		return list;
	}
}
