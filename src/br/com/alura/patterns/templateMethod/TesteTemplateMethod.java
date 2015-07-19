package br.com.alura.patterns.templateMethod;

import br.com.alura.patterns.chainOfResponsability.Item;
import br.com.alura.patterns.strategy.Orcamento;

public class TesteTemplateMethod {

	public static void main(String[] args) {
		
		Orcamento orcamentoICPP = new Orcamento(100.0);
		Item caneta = new Item("CANETA", 50.0);
		orcamentoICPP.adicionaItem(caneta);
		Item borracha = new Item("BORACHA", 50.0);
		orcamentoICPP.adicionaItem(borracha);		
		ICPP icpp = new ICPP();
		System.out.println(icpp.calcula(orcamentoICPP));
		
		Orcamento orcamentoIKCV = new Orcamento(350.0);
		Item teclado = new Item("TECLADO", 200.0);
		orcamentoIKCV.adicionaItem(teclado);
		Item mouse = new Item("MOUSE", 150.0);
		orcamentoIKCV.adicionaItem(mouse);
		IKCV ikcv = new IKCV();
		System.out.println(ikcv.calcula(orcamentoIKCV));
				
	}	
}
