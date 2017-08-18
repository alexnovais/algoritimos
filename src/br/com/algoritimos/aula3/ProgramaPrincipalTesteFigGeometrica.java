package br.com.algoritimos.aula3;

import java.util.Scanner;

public class ProgramaPrincipalTesteFigGeometrica {

	public static void main(String[] args) {
		
		FiguraGeometrica fg = new FiguraGeometrica();

		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre como o tamanho do lado A: ");
		int a = leitor.nextInt();
		System.out.println("Entre como o tamanho do lado B: ");
		int b = leitor.nextInt();
		System.out.println("Entre como o tamanho do lado C: ");
		int c = leitor.nextInt();

		String triangulo = fg.identificarTriangulo(a, b, c);
		System.out.println("O triângulo é: " + triangulo);

	}

}
