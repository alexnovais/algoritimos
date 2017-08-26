package br.com.algoritimos.aula5;

import java.util.Scanner;

/**
 * @author Alex Novais
 * 
 *         Faça um programa que leia 3 números inteiros e imprima qual é maior
 *         entre eles?
 * 
 */

public class ProgramaPrincipalMaior3 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite n1");
		int n1 = leitor.nextInt();

		System.out.println("Digite n2");
		int n2 = leitor.nextInt();

		System.out.println("Digite n3");
		int n3 = leitor.nextInt();

		int maior = 0;

		if (n1 > n2) {
			maior = n1;
			System.out.println("Maior: " + maior);
		} else if (n2 > n1) {
			maior = n2;
			System.out.println("Maior: " + maior);
		} else {
			System.out.println("São iguais!");
		}

		leitor.close();
	}

}
