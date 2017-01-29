package br.com.fiap.sct.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.sct.dao.EscolaDao;
import br.com.fiap.sct.entity.Escola;

/**
 * Servlet implementation class EditarEscolaServlet
 */
@WebServlet("/escola/editarEscola")
public class EditarEscolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditarEscolaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==============TESTE==============");
		String codigo = (String) request.getParameter("codigo");
		EscolaDao dao = new EscolaDao();
		Escola escola = new Escola();
		if(codigo == null){
			int codigoInt = Integer.valueOf(codigo).intValue();
			escola = dao.buscar(codigoInt);
		}
		request.setAttribute("escola", escola);
		request.getRequestDispatcher("editarEscola.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
