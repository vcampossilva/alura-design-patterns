package br.com.alura.patterns.chainOfResponsability;

public class TesteDeDesconto {

	public static void main(String[] args) {
		
		CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		System.out.println(descontoFinal);
	}
}
