package br.com.fiap.sct.teste;

import java.util.Set;

import br.com.fiap.sct.dao.AlunoDao;
import br.com.fiap.sct.dao.CursoDao;
import br.com.fiap.sct.dao.DisciplinaDao;
import br.com.fiap.sct.dao.EscolaDao;
import br.com.fiap.sct.dao.NotasDao;
import br.com.fiap.sct.dao.ProfessorDao;
import br.com.fiap.sct.dao.UsuarioDao;
import br.com.fiap.sct.entity.Aluno;
import br.com.fiap.sct.entity.Curso;
import br.com.fiap.sct.entity.Disciplina;
import br.com.fiap.sct.entity.Escola;
import br.com.fiap.sct.entity.Nota;
import br.com.fiap.sct.entity.NotaPK;
import br.com.fiap.sct.entity.Professor;
import br.com.fiap.sct.entity.Usuario;
import br.com.fiap.sct.type.Perfil;

public class Main {

	public static void main(String[] args) {

		EscolaDao escolaDao = new EscolaDao();
		CursoDao cursoDao = new CursoDao();
		ProfessorDao professorDao = new ProfessorDao();
		AlunoDao alunoDao = new AlunoDao();
		DisciplinaDao disciplinaDao = new DisciplinaDao();
		NotasDao notasDao = new NotasDao();
		UsuarioDao usuarioDao = new UsuarioDao();
		
//		Escola escola = new Escola();
//		escola.setNome("FIAP - Faculdade de Informatica");
//		escola.setEndereco("Lins de vasc");
//		escola.setTelefone("32079441");
//		
//		escolaDao.adicionar(escola);
//		Escola fiap = escolaDao.buscar(1);
//		System.out.println(fiap);
//		
//		Curso curso1 = new Curso();
//		curso1.setNome("MBA EM DESENVOLVIMENTO DE APLICA��ES JAVA SOA E INTERNET DAS COISAS");
//
//		Disciplina disciplina1 = new Disciplina();
//		disciplina1.setNome("PLATAFORMA JAVA E JEE");
//		disciplina1.setCurso(curso1);
//
//		Disciplina disciplina2 = new Disciplina();
//		disciplina2.setNome("T�PICOS AVAN�ADOS EM DESENVOLVIMENTO DE APLICA��ES");
//		disciplina2.setCurso(curso1);
//
//		curso1.addDisciplina(disciplina1);
//		curso1.addDisciplina(disciplina2);
//		curso1.setEscola(escola);
//		escola.addCurso(curso1);
//		
//		Usuario usuarioProfessor = new Usuario();
//		usuarioProfessor.setLogin("jefferson.souza");
//		usuarioProfessor.setSenha("fiap123");
//		usuarioProfessor.setPerfil(Perfil.PROFESSOR);
//		usuarioDao.adicionar(usuarioProfessor);
//		System.out.println(usuarioProfessor);
//		
//		Professor professor = new Professor();
//		professor.setNome("Jefferson Souza");
//		professor.setUsuario(usuarioProfessor);
//		
//		cursoDao.adicionar(curso1);
//		System.out.println(curso1);
//		professorDao.adicionar(professor);
//		System.out.println(professor);
//		
//		disciplina1.setProfessor(professor);
//		disciplina2.setProfessor(professor);
//		professor.addDisciplina(disciplina1);
//		professor.addDisciplina(disciplina2);
//		disciplinaDao.atualizar(disciplina1);
//		disciplinaDao.atualizar(disciplina2);
//		professorDao.atualizar(professor);
		
//		Usuario usuarioAluno = new Usuario();
//		usuarioAluno.setLogin("igao");
//		usuarioAluno.setSenha("123");
//		usuarioAluno.setPerfil(Perfil.ADMINISTRADOR);
//		usuarioDao.adicionar(usuarioAluno);
//		System.out.println(usuarioAluno);
//		
//		Aluno aluno1 = new Aluno();
//		aluno1.setNome("IGAO");
//		aluno1.setRa(30967);
//		aluno1.setUsuario(usuarioAluno);
//		alunoDao.adicionar(aluno1);
//		System.out.println(aluno1);
//		
//		curso1.addAluno(aluno1);
//		aluno1.setCurso(curso1);
//		
//		cursoDao.atualizar(curso1);
//		System.out.println(curso1);
//		
		Aluno igor = alunoDao.buscar(1);
		
		Set<Disciplina> disciplinas = igor.getCurso().getDisciplinas();
		
		for (Disciplina disciplina : disciplinas) {
			NotaPK notaPK = new NotaPK();
			notaPK.setAluno(igor.getId());
			notaPK.setDisciplina(disciplina.getId());
			
			Nota notas = new Nota();
			notas.setNotaPK(notaPK);
			notas.setAtividadePratica(10);
			notas.setProjeto1(10);
			notas.setProjeto2(8);
			
			notasDao.adicionar(notas);
		}
		
//		
//		System.out.println(aluno1);
		
		System.out.println("=====> TESTE FINALIZADO !!! <=====");
		
	}
}

