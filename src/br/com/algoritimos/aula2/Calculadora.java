package br.com.algoritimos.aula2;

public class Calculadora {

	String marca;
	String modelo;
	Integer tamanho;
	Double peso;

	public Double calcularSoma(Double n1, Double n2) {
		Double soma = n1 + n2;
		return soma;
	}

	public Double calcularSubtracao(Double n1, Double n2) {
		Double subtracao = n1 - n2;
		return subtracao;
	}

	public Double calcularMultiplicacao(Double n1, Double n2) {
		Double multiplicacao = n1 * n2;
		return multiplicacao;
	}

	public Double calcularDivisao(Double n1, Double n2) {
		Double divisao = null;
		if (n1 > 0 && n2 > 0) {
			divisao = n1 / n2;
		}
		return divisao;
	}

	public boolean ehPar(int n) {
		if (!(n % 2 == 0)) {
			return false;
		} else {
			return true;
		}
	}

	public Double calcular(Double n1, Double n2, Integer operacao) {
		Double calculo = null;
		if (operacao == 1) {
			calculo = calcularSoma(n1, n2);
		} else {
			if (operacao == 2) {
				calculo = calcularSubtracao(n1, n2);
			} else {
				if (operacao == 3) {
					calculo = calcularDivisao(n1, n2);
				} else {

					calculo = calcularMultiplicacao(n1, n2);

				}
			}
		}
		return calculo;
	}

}
