package br.com.fiap.sct.dao;

import javax.persistence.Query;

import br.com.fiap.sct.dao.util.GenericDao;
import br.com.fiap.sct.dao.util.JpaUtil;
import br.com.fiap.sct.entity.Escola;

public class EscolaDao extends GenericDao<Escola> {
	
	public EscolaDao(){
		super(Escola.class);
	}
	
	public Escola buscarEscola(String nome){
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();		
		
		Query query = em.createQuery("select e from Escola e where e.nome = :nome");
		
		query.setParameter("nome", nome);
		return (Escola)query.getSingleResult();
	}

}
