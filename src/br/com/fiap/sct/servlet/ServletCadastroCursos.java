package br.com.fiap.sct.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.sct.dao.CursoDao;
import br.com.fiap.sct.dao.EscolaDao;
import br.com.fiap.sct.entity.Curso;
import br.com.fiap.sct.entity.Escola;

/**
 * Servlet implementation class ServletCursos
 */
@WebServlet("/curso/cadCursos")
public class ServletCadastroCursos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
    public ServletCadastroCursos() {
    	super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idEscola = (String) request.getParameter("escolaSlc");
		String nome = (String) request.getParameter("nome");
		
		Escola escola = new Escola();
		EscolaDao escolaDao = new EscolaDao();
		escola = escolaDao.buscar(Integer.valueOf(idEscola).intValue());
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setEscola(escola);
		CursoDao cursoDao = new CursoDao();
		cursoDao.adicionar(curso);
		
		List<Curso> lista = new ArrayList<Curso>();
		lista = cursoDao.listar();
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("listaCursos.jsp").forward(request, response);
	}

}
