package br.com.algoritimos.aula4;

import java.util.Scanner;

import br.com.algoritimos.aula2.Calculadora;

public class EstruturaRepeticaoWhile {

	public static void main(String[] args) {

		Calculadora calc1 = new Calculadora();

		Scanner leitor = new Scanner(System.in);

		Integer quantidadesSomas = 0;

		while (quantidadesSomas < 3) {

			System.out.println("Digite um número");
			Double numeroDigitado1 = leitor.nextDouble();

			System.out.println("Digite outro número");
			Double numeroDigitado2 = leitor.nextDouble();

			System.out.println("Digite a operação. (1 - soma, 2 - subtração, 3 - divisão ou 4 - multiplicação");
			Integer operacaoDigitada = leitor.nextInt();

			
			System.out.println(calc1.calcular(numeroDigitado1, numeroDigitado2, operacaoDigitada));

			quantidadesSomas = quantidadesSomas + 1;

		}

		leitor.close();

	}

}