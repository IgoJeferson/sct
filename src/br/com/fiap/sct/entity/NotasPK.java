package br.com.fiap.sct.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NotasPK implements Serializable {
	
	private static final long serialVersionUID = -1907774216456954487L;

	@Column(name="ALUNO_ID")
	private Integer alunoID;

	@Column(name="DISCIPLINA_ID")
	private String disciplinaID;

	public Integer getAlunoID() {
		return alunoID;
	}

	public void setAlunoID(Integer alunoID) {
		this.alunoID = alunoID;
	}

	public String getDisciplinaID() {
		return disciplinaID;
	}

	public void setDisciplinaID(String disciplinaID) {
		this.disciplinaID = disciplinaID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunoID == null) ? 0 : alunoID.hashCode());
		result = prime * result + ((disciplinaID == null) ? 0 : disciplinaID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotasPK other = (NotasPK) obj;
		if (alunoID == null) {
			if (other.alunoID != null)
				return false;
		} else if (!alunoID.equals(other.alunoID))
			return false;
		if (disciplinaID == null) {
			if (other.disciplinaID != null)
				return false;
		} else if (!disciplinaID.equals(other.disciplinaID))
			return false;
		return true;
	}
	
}
