package empresa;

public class Empregado {
	
	private String nome;
	private String sobrenome;
	private static int contador = 0;
	
	public Empregado(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		contador++;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public static int getContador() {
		return contador;
	}

}
