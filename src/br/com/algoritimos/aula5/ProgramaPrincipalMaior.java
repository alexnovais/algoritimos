package br.com.algoritimos.aula5;

import java.util.Scanner;

/**
 * @author Alex Novais
 * 
 *         Fa�a um programa que leia 2 n�meros inteiros e imprima qual � maior
 *         entre eles?
 * 
 */

public class ProgramaPrincipalMaior {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite n1");
		int n1 = leitor.nextInt();

		System.out.println("Digite n2");
		int n2 = leitor.nextInt();

		int maior = 0;

		if (n1 > n2) {
			maior = n1;
			System.out.println("Maior: " + maior);
		} else if (n2 > n1) {
			maior = n2;
			System.out.println("Maior: " + maior);
		} else {
			System.out.println("S�o iguais!");
		}

		leitor.close();
	}

}
