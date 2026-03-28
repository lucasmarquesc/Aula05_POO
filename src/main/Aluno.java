package main;

public class Aluno {
	
	private String nome;
	private String matricula;
	private Disciplina [] disciplinas;
	private int qtdDisciplina;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.disciplinas = new Disciplina[3];
		this.qtdDisciplina = 0;
	}
	
	private double calcularMedia (double nota1, double nota2) {
		double media = (nota1+nota2)/2;
		return media;		
	}
	
	public void realizarMatricula(Disciplina disciplina) {
		this.disciplinas[qtdDisciplina] = disciplina;
		this.qtdDisciplina++;
		disciplina.matricularAluno(this);
	}
	
	public int getTotalDisciplinas() {
		return this.qtdDisciplina;
	}
	
	public String exibirConceito(double media) {
		String conceito;
		if (media >= 7 && media <= 10) {
			conceito = "Aprovado";
		}else if (media < 7 && media >= 5) {
			conceito = "Final";
		}else {
			conceito = "Reprovado";
		}
		return conceito;
		
	}
	
	public void exibirHistorico() {
		System.out.println("---Histórico Escolar---");
		System.out.println("Aluno: " + this.nome);
		for (Disciplina disc : this.disciplinas) {
			if (disc != null) {
				System.out.println("Código: " + disc.getCodigo());
				System.out.println("Nome da disciplina: " + disc.getNomeDisciplina());
				double media = this.calcularMedia(disc.getNota1(), disc.getNota2());
				System.out.println("Média: " + media);
				System.out.println("Conceito: " + this.exibirConceito(media));
			}
		}
		
	}
	
	public void exibirDados() {
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Quantidade de disciplinas matriculadas: " + this.qtdDisciplina);
	}
	

}
