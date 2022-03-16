package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	@SuppressWarnings("unlikely-arg-type")
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

		}
			
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma matéria? ");
		if (escolha == 0 ) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2 3 ou 4");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
		}
		
		System.out.println(aluno1.toString()); // Descrição do objeto na memória
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("A média do aluno foi " + aluno1.getMediaNota());
		System.out.println(aluno1.getDisciplinas());

	}
}
