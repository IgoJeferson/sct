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
 * Servlet implementation class ExcluirEscolaServlet
 */
@WebServlet("/escola/excluir")
public class ExcluirEscolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcluirEscolaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = (String) request.getParameter("codigo");
		Escola escola = new Escola();
		List<Escola> listaEscolas = new ArrayList<Escola>();
		EscolaDao dao = new EscolaDao();
		CursoDao cursoDao = new CursoDao();
		if(codigo != null){
			Curso curso  = new Curso();
			curso = cursoDao.buscar(Integer.valueOf(codigo).intValue());
			if(curso != null){
				escola = dao.buscar(Integer.valueOf(codigo).intValue());
				dao.remover(escola);
			}
			listaEscolas = dao.listar();
			request.setAttribute("listaEscolas", listaEscolas);
			request.getRequestDispatcher("listaEscola.jsp").forward(request, response);		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
}