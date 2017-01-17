package br.com.fiap.sct.dao;

import br.com.fiap.sct.dao.util.GenericDao;
import br.com.fiap.sct.entity.Aluno;

public class AlunoDao extends GenericDao<Aluno>{

	public AlunoDao() {
		super(Aluno.class);
	}

}
