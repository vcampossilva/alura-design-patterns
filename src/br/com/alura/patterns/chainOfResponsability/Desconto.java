package br.com.alura.patterns.chainOfResponsability;

public interface Desconto {

	double desconto(Orcamento orcamento);
	
	void setProximo(Desconto desconto);
}
