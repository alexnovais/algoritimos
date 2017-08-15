package br.com.algoritimos.aula2;

import br.com.algoritimos.aula1.Cliente;

public class ProgramaPrincipalAula02 {
	
	public static void main(String[] args){
		
		//Declaração
		Cliente c1, c2;
		
		//Instanciamento
		c1 = new Cliente();
		
		c1.nome = "Alex";
		c1.rg = "21314244234";
		c1.cpf = "123.321.543.02";
		c1.altura = 1.76;
		c1.peso = 85.0;
		c1.ativado = true;
		c1.estadoCivil = EstadoCivil.CASADO;
		c1.sexo = Sexo.MASC;
		
		c2 = new Cliente();
		
		c2.nome = "Jão";
		c2.rg = "21314244234";
		c2.cpf = "123.321.543.02";
		c2.altura = 1.75;
		c2.peso = 70.0;
		c2.ativado = true;
		c2.estadoCivil = EstadoCivil.SOLTEIRO;
		c2.sexo = Sexo.MASC;
	}

}
