package br.com.alura.patterns.chainOfResponsability;

public class CalculadoraDeDescontos {

	public double calcula(Orcamento orcamento){
		
		Desconto desconto1 = new DescontosPorCincoItens();
		Desconto desconto2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto desconto3 = new DescontoPorVendaCasada();
		Desconto desconto4 = new SemDesconto();
		
		desconto1.setProximo(desconto2);
		desconto2.setProximo(desconto3);
		desconto3.setProximo(desconto4);
		
		return desconto1.desconto(orcamento);
	}
}
