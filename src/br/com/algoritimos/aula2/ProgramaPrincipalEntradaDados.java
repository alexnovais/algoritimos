package br.com.algoritimos.aula2;

import java.util.Scanner;

public class ProgramaPrincipalEntradaDados {

	public static void main(String[] args) {

		// Entrada de dados pelo teclado
		Scanner leitor = new Scanner(System.in);

		// Saída
		System.out.println("Nome:");

		// Entrada
		String textoDigitado = leitor.next();

		// Saída
		System.out.println("Você digitou: " + textoDigitado.toUpperCase());

		Calculadora calc = new Calculadora();
		
		System.out.println("Digite n1:");
		int n1 = leitor.nextInt();
		
		System.out.println("Digite n2");
		int n2 = leitor.nextInt();

		int s = calc.calcularSoma(n1, n2);
		
		System.out.println("A soma é:" + s);
		//Encerramento do objeto
		leitor.close();

	}
}
