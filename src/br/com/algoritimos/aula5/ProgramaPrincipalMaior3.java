package br.com.algoritimos.aula5;

import java.util.Scanner;

/**
 * @author Alex Novais
 * 
 *         Fa�a um programa que leia 3 n�meros inteiros e imprima qual � maior
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
		int menor = 0;

		if (n3 > n2 && n3 > n1) {
			maior = n3;
		} else if (n2 > n1 && n2 > n3) {
			maior = n2;

		} else {
			maior = n1;
		}

		if (n3 < n2 && n3 < n1) {
			menor = n3;
		} else if (n2 < n1 && n2 < n3) {
			menor = n2;

		} else {
			menor = n1;
		}

		System.out.println("Menor: "+ menor + " Maior: " + maior);

		leitor.close();
	}

}
