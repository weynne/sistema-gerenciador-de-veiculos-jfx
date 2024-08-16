package br.com.fuctura.sistemagerenciadordeveiculos.dao.factory;

import br.com.fuctura.sistemagerenciadordeveiculos.dao.VeiculoDAO;
import br.com.fuctura.sistemagerenciadordeveiculos.dao.impl.VeiculoDAOImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DAOFactory {

	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("FUCTURA-PU");
		} catch (Exception e) {
			throw new RuntimeException("Erro ao criar EntityManagerFactory: " + e.getMessage(), e);
		}
	}

	public static EntityManager createEntityManager() {
		return emf.createEntityManager();
	}

	public static VeiculoDAO createVeiculoDAO() {
		return new VeiculoDAOImpl(createEntityManager());
	}
}
