package br.com.algoritimos.aula3;

import java.util.Scanner;

import br.com.algoritimos.aula2.Calculadora;

public class ProgramaPrincipalAula3 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		//System.out.println("Digite um n�mero: ");
		
		Calculadora calc = new Calculadora();
		/*boolean r = calc.ehPar(leitor.nextInt());
		System.out.println(r);
		
		leitor.close();*/
		
		System.out.println("Digite o primeiro n�mero:");
		Double a = leitor.nextDouble();
		
		System.out.println("Digite o segundo n�mero:");
		Double b = leitor.nextDouble();
		
		System.out.println("Opera��o (1=soma, 2=subtra��o, 3=divis�o e 4=multiplica��o)");
		Integer op = leitor.nextInt();
		
		Double r = calc.calcular(a,b, op);
		System.out.println("O Resultado da divis�o �: "+r);
	}

}
