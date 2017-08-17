package br.com.algoritimos.aula3;

import java.util.Scanner;

import br.com.algoritimos.aula2.Calculadora;

public class ProgramaPrincipalAula3 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		//System.out.println("Digite um número: ");
		
		Calculadora calc = new Calculadora();
		/*boolean r = calc.ehPar(leitor.nextInt());
		System.out.println(r);
		
		leitor.close();*/
		
		System.out.println("Digite o primeiro número:");
		Double a = leitor.nextDouble();
		
		System.out.println("Digite o segundo número:");
		Double b = leitor.nextDouble();
		
		System.out.println("Operação (1=soma, 2=subtração, 3=divisão e 4=multiplicação)");
		Integer op = leitor.nextInt();
		
		Double r = calc.calcular(a,b, op);
		System.out.println("O Resultado da divisão é: "+r);
	}

}
