package cursojava.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

// Classe e objeto que representa o Aluno
public class Aluno {
	// atributos de aluno
	String nome;
	int idade;
	String dataNascimento;
	String rg;
	String cpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() { // Cria os dados na memória - sendo padrão do java toda vez que se escreve o new
						// pelo backend

	}

	// crianção de construtores passando uma varaivel padrão
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	// criação de construtor com mais de uma variavel, separando as com vírgula
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	// Métodos SETTER e GETTER do objeto
	// SET é para definir um valor
	// GET é para ler/obter um atributo

	public void setNome(String nome) { // método set recebe dados
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	// método que retorna a média do aluno

	public double getMediaNota() {

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();

		}
		return somaNotas/disciplinas.size(); // divide pelo tamanho da lista realizando a média
	}

	// MÉTODO QUE RETORNA TRUE PARA APROVADO E FALSE PARA REPROVADO
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	// MÉTODO QUE RETORNA UM STRING PARA APROVADO E OUTRA PARA REPROVADO
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return "Aluno Aprovado";
		} else {
			return "Aluno reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", rg=" + rg
				+ ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula
				+ ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}

}
