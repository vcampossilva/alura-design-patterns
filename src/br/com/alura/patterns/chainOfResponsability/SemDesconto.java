package br.com.alura.patterns.chainOfResponsability;

public class SemDesconto implements Desconto {

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		
	}

}
