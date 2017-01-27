package br.com.fiap.sct.bean;

import java.util.List;

import br.com.fiap.sct.dao.EscolaDao;
import br.com.fiap.sct.entity.Escola;

public class EscolaBean {

	public List<Escola> getListaEscolas(){
		EscolaDao dao = new EscolaDao();
		return dao.listar();
	}
}
