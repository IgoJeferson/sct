package br.com.fiap.sct.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SCT_DISCIPLINAS")
public class Disciplina implements Serializable {

	private static final long serialVersionUID = -5039456820736552686L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false) 
	private Integer id;

	@Column(name="NOME", nullable=false, length=100)
	private String nome;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Curso curso;
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="disciplinas") 
	private Set<Professor> professor = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Professor> getProfessor() {
		return professor;
	}

	public void setProfessor(Set<Professor> professor) {
		this.professor = professor;
	}
	
	public void addProfessor(Professor professor){
		this.professor.add(professor);
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		if (nome != null)
			builder.append("nome=").append(nome);
		builder.append("]");
		return builder.toString();
	}

}
