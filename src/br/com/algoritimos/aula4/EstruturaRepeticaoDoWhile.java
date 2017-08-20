package br.com.algoritimos.aula4;

import java.util.Scanner;

import br.com.algoritimos.aula2.Calculadora;

public class EstruturaRepeticaoDoWhile {
	public static void main(String[] args) {

		Calculadora calc1 = new Calculadora();

		Scanner leitor = new Scanner(System.in);

		Integer sair= 0;

		do {

			System.out.println("Digite um n�mero");
			Double numeroDigitado1 = leitor.nextDouble();

			System.out.println("Digite outro n�mero");
			Double numeroDigitado2 = leitor.nextDouble();

			System.out.println("Digite a opera��o. (1 - soma, 2 - subtra��o, 3 - divis�o ou 4 - multiplica��o");
			Integer operacaoDigitada = leitor.nextInt();

			System.out.println(calc1.calcular(numeroDigitado1, numeroDigitado2, operacaoDigitada));

			System.out.println("Deseja fazer novo calculo? 1 - Sim, 2 - N�o");
			
			sair = leitor.nextInt();

		} while (sair==1);

		leitor.close();
	}
}
