package br.com.fuctura.sistemagerenciadordeveiculos.dao;

import java.util.List;

import br.com.fuctura.sistemagerenciadordeveiculos.entities.Veiculo;

public interface VeiculoDAO {

	void insert(Veiculo obj);

	void update(Veiculo obj);

	void deleteById(Long id);

	Veiculo findById(Long id);

	List<Veiculo> findAll();
}
