package br.com.fiap.sct.dao;

import br.com.fiap.sct.dao.util.GenericDao;
import br.com.fiap.sct.entity.Professor;

public class ProfessorDao extends GenericDao<Professor>{

	public ProfessorDao() {
		super(Professor.class);
	}
	

}
