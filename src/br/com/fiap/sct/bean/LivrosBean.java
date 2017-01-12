package br.com.fiap.sct.bean;

import java.util.List;

import br.com.fiap.sct.dao.GenericDao;
import br.com.fiap.sct.entity.Livro;

public class LivrosBean {

	public List<Livro> getListaLivros(){
		GenericDao<Livro> dao = new GenericDao<>(Livro.class);
		return dao.listar();
	}
}
