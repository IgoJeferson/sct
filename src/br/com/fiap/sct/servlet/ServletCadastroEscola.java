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
 * Servlet implementation class ServletCadastroEscola
 */
@WebServlet("/escola/cadEscola")
public class ServletCadastroEscola extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastroEscola() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = (String) request.getParameter("nmEscola");
		String endereco = (String) request.getParameter("enderecoEscola");
		String telefone = (String)  request.getParameter("telefoneEscola");
		Escola escola = new Escola();
		escola.setNome(nome);
		escola.setEndereco(endereco);
		escola.setTelefone(telefone);
		EscolaDao dao = new EscolaDao();
		dao.adicionar(escola);
		List<Escola> lista = new ArrayList<Escola>();
		lista = dao.listar();
		request.getRequestDispatcher("listarEscola.jsp").forward(request, response);		
	}

}
