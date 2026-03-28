package calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calculadora = new Calculadora("UNIR", "Casio", "Prova de Cálculo I");
		System.out.println("Soma = " + calculadora.somar(1, 2));
		System.out.println("Soma = " + calculadora.somar(1.9, 2.1));
		System.out.println("Subtrair = " + calculadora.subtrair(1, 2));
		System.out.println("Subtrair = " + calculadora.subtrair(1.3, 2.8));

	}

}
