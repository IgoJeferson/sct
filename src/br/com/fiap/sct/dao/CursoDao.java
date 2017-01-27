package br.com.fiap.sct.dao;

import javax.persistence.Query;

import br.com.fiap.sct.dao.util.GenericDao;
import br.com.fiap.sct.dao.util.JpaUtil;
import br.com.fiap.sct.entity.Curso;

public class CursoDao extends GenericDao<Curso> {

	public CursoDao() {
		super(Curso.class);
	}

	public Curso getCuro(int id){
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();		
		Query query = em.createQuery("select c from Curso c where c.id = :id");
		query.setParameter("id", id);
		return (Curso)query.getSingleResult();
	}
}
