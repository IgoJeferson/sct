package br.com.fiap.sct.bean;

import java.util.List;

import br.com.fiap.sct.dao.AlunoDao;
import br.com.fiap.sct.entity.Aluno;

public class AlunosBean {
	
	private int codigoProfessor;
	
	public List<Aluno> getConsultarAlunos(){
		return new AlunoDao().listar();
	}
	
	public List<Aluno> getConsultarAlunosPorProfessor(){
		return new AlunoDao().consultarAlunosPorProfessor(codigoProfessor);
	}

	public int getCodigoProfessor() {
		return codigoProfessor;
	}

	public void setCodigoProfessor(int codigoProfessor) {
		this.codigoProfessor = codigoProfessor;
	}
	

}
