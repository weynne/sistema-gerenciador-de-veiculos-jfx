package br.com.fuctura.sistemagerenciadordeveiculos.services;

import java.util.List;

import br.com.fuctura.sistemagerenciadordeveiculos.dao.VeiculoDAO;
import br.com.fuctura.sistemagerenciadordeveiculos.dao.factory.DAOFactory;
import br.com.fuctura.sistemagerenciadordeveiculos.entities.Veiculo;

public class VeiculoService {

	private VeiculoDAO dao = DAOFactory.createVeiculoDAO();
	
	public List<Veiculo> findAll() {
		return dao.findAll();
	}
}
