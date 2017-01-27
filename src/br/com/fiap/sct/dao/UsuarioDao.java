package br.com.fiap.sct.dao;

import javax.persistence.Query;

import br.com.fiap.sct.dao.util.GenericDao;
import br.com.fiap.sct.dao.util.JpaUtil;
import br.com.fiap.sct.entity.Usuario;

public class UsuarioDao extends GenericDao<Usuario>{
	
	public UsuarioDao(){
		super(Usuario.class);
	}
	
	public Usuario buscarUsuario(String nome, String senha){
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();		
		
		Query query = em.createQuery("select e from Usuario e where e.nome = :nome and e.senha = :senha");
		
		query.setParameter("nome", nome);
		query.setParameter("senha", senha);
		return (Usuario)query.getSingleResult();
	}

	
}
