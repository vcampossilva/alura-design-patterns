package br.com.alura.patterns.chainOfResponsability;

public class CalculadoraDeDescontos {

	public double calcula(Orcamento orcamento){
		
		Desconto desconto1 = new DescontosPorCincoItens();
		Desconto desconto2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto desconto3 = new SemDesconto();
		
		desconto1.setProximo(desconto2);
		desconto2.setProximo(desconto3);
		
		return desconto1.desconto(orcamento);
	}
}
