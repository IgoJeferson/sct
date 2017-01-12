package br.com.fiap.sct.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.sct.dao.GenericDao;
import br.com.fiap.sct.entity.Livro;

@WebServlet("/admin/imagem")
public class ServletImagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletImagem() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		GenericDao<Livro> dao = new GenericDao<>(Livro.class);
		
		byte[] imagem = dao.buscar(id).getImagem();
		response.setContentType("image/jpeg");
		ServletOutputStream os = response.getOutputStream();
		os.write(imagem);
		os.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}






