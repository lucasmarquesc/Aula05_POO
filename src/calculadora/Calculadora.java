package calculadora;

public class Calculadora {
	
	private String modelo;
	private String marca;
	private String utilidade;
	
	public Calculadora(String modelo, String marca, String utilidade) {
		this.modelo = modelo;
		this.marca = marca;
		this.utilidade = utilidade;
	}
	
	public int somar(int num1, int num2) {
		return num1+num2;
	}
	
	public double somar(double num1, double num2) {
		return num1+num2;
	}
	public int subtrair(int num1, int num2) {
		return num1-num2;
	}
	
	public double subtrair(double num1, double num2) {
		return num1-num2;
	}

}
