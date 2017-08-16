package br.com.algoritimos.aula3;

import java.util.Scanner;

import br.com.algoritimos.aula2.Calculadora;

public class ProgramaPrincipalAula3 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		Calculadora calc = new Calculadora();
		boolean r = calc.ehPar(leitor.nextInt());
		System.out.println(r);
		
		leitor.close();
	}

}
