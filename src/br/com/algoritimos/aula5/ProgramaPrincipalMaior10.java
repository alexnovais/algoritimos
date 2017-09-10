package br.com.algoritimos.aula5;

import java.util.Scanner;

public class ProgramaPrincipalMaior10 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n;
		int maior = 0;

		// loop de 10 vezes
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Digite N"+(i+1)+":");
			n = leitor.nextInt();
			if (n > maior) {
				maior = n;
			}
		}
		System.out.println(" Maior: " + maior);
		leitor.close();
	}
}
