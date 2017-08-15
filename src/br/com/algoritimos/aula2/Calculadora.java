package br.com.algoritimos.aula2;

public class Calculadora {
	
	String marca;
	String modelo;
	Integer tamanho;
	Double peso;
	
	public int calcularSoma(int n1, int n2){
		int soma = n1 + n2;
		return soma;
	}
	
	public Double calcularSubtracao(Double n1, Double n2){
		Double subtracao = n1 - n2;
		return subtracao;
	}
	
	public Double calcularMultiplicacao(Double n1, Double n2){
		Double multiplicacao = n1 * n2;
		return multiplicacao;
	}
	
	public Double calcularDivisao(Double n1, Double n2){
		Double divisao = n1 / n2;
		return divisao;
	}

	
}
