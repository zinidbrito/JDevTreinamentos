package cursojava.classes;

import java.util.Objects;

//Essa classe servirá para todos os objetos e instancias de notas e disciplinas
public class Disciplina {

	double nota;
	String disciplina;

	public double getNota() {
		return nota;
	}

	public void setNota(Double double1) {
		this.nota = double1;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
