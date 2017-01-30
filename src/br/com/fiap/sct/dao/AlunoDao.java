package br.com.fiap.sct.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.fiap.sct.dao.util.GenericDao;
import br.com.fiap.sct.dao.util.JpaUtil;
import br.com.fiap.sct.entity.Aluno;

public class AlunoDao extends GenericDao<Aluno>{

	public AlunoDao() {
		super(Aluno.class);
	}

	public List<Aluno> consultarAlunosPorProfessor(int codigoProfessor) {
		
		try {

			em = JpaUtil.getEntityManager();
			em.getTransaction().begin();

			TypedQuery<Aluno> query = em.createQuery(
					"select distinct a from Aluno a "
					+ "inner join a.curso c "
					+ "inner join c.disciplinas as d "
					+ "where d.professor.id = :codigoProfessor", Aluno.class);
			
			query.setParameter("codigoProfessor", codigoProfessor);

			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		}	}

}
