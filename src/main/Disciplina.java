package main;

import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private String codigo;
	private double nota1;
	private double nota2;
	private String professor;
	private ArrayList<Aluno> alunos;
	
	public Disciplina(String nome, String codigo, double n1, double n2, String professor) {
		this.nome = nome;
		this.codigo = codigo;
		this.nota1 = n1;
		this.nota2 = n2;
		this.professor = professor;
		this.alunos = new ArrayList<>();
	}
	
	public void exibirDados() {
		System.out.println("Dados da Disciplina: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Código: " + this.codigo);
		System.out.println("Nota 1: " + this.nota1);
		System.out.println("Nota 2: " + this.nota2);
		System.out.println("Professor: " + this.professor);
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getNomeDisciplina() {
		return this.nome;
	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public void atualizarNotas(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public void matricularAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void listarAlunos() {
		for (Aluno aluno : this.alunos) {
			aluno.exibirHistorico();
		}
	}
	

}
