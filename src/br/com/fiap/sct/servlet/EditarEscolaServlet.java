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
 * Servlet implementation class EditarEscolaServlet
 */
@WebServlet("/escola/editarEscola")
public class EditarEscolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditarEscolaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==========entrou no doGet");
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
		System.out.println("==========entrou no doPost");
		String id = (String) request.getParameter("id");
		String nome = (String) request.getParameter("nmEscola");
		String endereco = (String) request.getParameter("enderecoEscola");
		String telefone = (String)  request.getParameter("telefoneEscola");
		Escola escola = new Escola();
		escola.setId(Integer.valueOf(id));
		escola.setNome(nome);
		escola.setEndereco(endereco);
		escola.setTelefone(telefone);
		EscolaDao dao = new EscolaDao();
		dao.atualizar(escola);
		List<Escola> listaEscolas = new ArrayList<Escola>();
		listaEscolas = dao.listar();
		request.setAttribute("listaEscolas", listaEscolas);
		request.getRequestDispatcher("listaEscola.jsp").forward(request, response);	
	}

}
