package br.com.fiap.sct.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.sct.dao.EscolaDao;
import br.com.fiap.sct.entity.Escola;

/**
 * Servlet implementation class ListaEscolaServlet
 */
@WebServlet("/escola/listaEscola")
public class ListaEscolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaEscolaServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EscolaDao dao = new EscolaDao();
		List<Escola> listaEscolas = new ArrayList<Escola>();
		listaEscolas = dao.listar();
		request.setAttribute("listaEscolas", listaEscolas);
		request.getRequestDispatcher("listaEscola.jsp").forward(request, response);
	}

}
