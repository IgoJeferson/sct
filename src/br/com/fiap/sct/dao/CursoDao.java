package br.com.fiap.sct.dao;

import br.com.fiap.sct.dao.util.GenericDao;
import br.com.fiap.sct.entity.Curso;

public class CursoDao extends GenericDao<Curso> {

	public CursoDao() {
		super(Curso.class);
	}

}
