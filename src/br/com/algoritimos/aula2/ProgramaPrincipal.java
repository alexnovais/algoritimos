package br.com.algoritimos.aula2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Calculadora calc1 = new Calculadora();
		
		int valorSomaRetornado = calc1.calcularSoma(10, 1);
		System.out.println(valorSomaRetornado);
		
		Double valorSubtracaoRetornado = calc1.calcularSubtracao(10.0, 1.0);
		System.out.println(valorSubtracaoRetornado);
		
		Double valorMultiplicacaoRetornado = calc1.calcularMultiplicacao(10.0, 3.0);
		System.out.println(valorMultiplicacaoRetornado);
		
		Double valorDivisaoRetornado = calc1.calcularDivisao(10.0, 2.0);
		System.out.println(valorDivisaoRetornado);
	}
	
}
