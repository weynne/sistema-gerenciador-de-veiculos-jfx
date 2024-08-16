package br.com.fuctura.sistemagerenciadordeveiculos.dao.impl;

import java.util.List;

import br.com.fuctura.sistemagerenciadordeveiculos.dao.VeiculoDAO;
import br.com.fuctura.sistemagerenciadordeveiculos.entities.Veiculo;
import jakarta.persistence.EntityManager;

public class VeiculoDAOImpl implements VeiculoDAO {

	private final EntityManager em;

	public VeiculoDAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void insert(Veiculo obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}

	@Override
	public void update(Veiculo obj) {
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
	}

	@Override
	public void deleteById(Long id) {
		Veiculo veiculo = em.find(Veiculo.class, id);
		if (veiculo != null) {
			em.getTransaction().begin();
			em.remove(veiculo);
			em.getTransaction().commit();
		}
	}

	@Override
	public Veiculo findById(Long id) {
		return em.find(Veiculo.class, id);
	}

	@Override
	public List<Veiculo> findAll() {
		return em.createQuery("FROM Veiculo", Veiculo.class).getResultList();
	}

}
