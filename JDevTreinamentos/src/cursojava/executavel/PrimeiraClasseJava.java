package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");// entrada de dados popup
		String idade = JOptionPane.showInputDialog("Qual a idade?");// entrada de dados popup
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");// entrada de dados popup
		String rg = JOptionPane.showInputDialog("Qual o numero do RG?");// entrada de dados popup
		String cpf = JOptionPane.showInputDialog("Qual o numero do CPF?");// entrada de dados popup
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da Mãe do Aluno?");// entrada de dados popup
		String nomePai = JOptionPane.showInputDialog("Qual o nome do Pai do Aluno?");// entrada de dados popup
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matrpicula?");// entrada de dados popup
		String serieMatriculado = JOptionPane.showInputDialog("Qual a série do aluno?");// entrada de dados popup
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola?");// entrada de dados popup

		Aluno aluno1 = new Aluno(); // instanciação do objeto

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); // converte a string idade para Inteiro
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setCpf(cpf);
		aluno1.setRg(rg);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina" + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina" + pos + "?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina); //adiciona disciplina
			aluno1.getDisciplinas().remove(disciplina); // remover disciplina


		}
			 

		/*
		 * System.out.println("Nome do aluno1 é: " + aluno1.getNome());
		 * System.out.println("Idade do aluno1 é: " + aluno1.getIdade());
		 * System.out.println("Idade do aluno1 é: " + aluno1.getDataNascimento());
		 * System.out.println("Seu RG é: " + aluno1.getRg());
		 * System.out.println("Sua escola é : " + aluno1.getNomeEscola());
		 * System.out.println("A média do aluno1 é: " + aluno1.getMediaNota());
		 * //operador ternário ? <= pergunta primeira condinção : <== ou segunda codição
		 * (true of false) System.out.println("Resultado "+ (aluno1.getAlunoAprovado() ?
		 * "Aprovado" : "Reprovado")); // operador TERNÁRIO ? TRUE : FALSE
		 * System.out.println("Resultado "+ aluno1.getAlunoAprovado2());
		 * System.out.println("=====================================================");
		 */
		System.out.println(aluno1.toString()); // Descrição do objeto na memória
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("A média do aluno foi " + aluno1.getMediaNota());

	}
}
