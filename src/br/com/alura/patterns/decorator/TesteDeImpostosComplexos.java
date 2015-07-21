package br.com.alura.patterns.decorator;

import br.com.alura.patterns.strategy.ICMS;
import br.com.alura.patterns.strategy.ISS;
import br.com.alura.patterns.strategy.Imposto;
import br.com.alura.patterns.strategy.Orcamento;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS(new ICMS());
		Orcamento orcamento = new Orcamento(500);
		double valor = iss.calcula(orcamento);
		System.out.println(valor);
		
		Imposto icms = new ICMS(new ImpostoMuitoAlto());
		Orcamento orcamento2 = new Orcamento(600);
		double valor2 = icms.calcula(orcamento2);
		System.out.println(valor2);		
		
	}
}
