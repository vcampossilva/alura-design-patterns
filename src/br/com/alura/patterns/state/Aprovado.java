package br.com.alura.patterns.state;

import br.com.alura.patterns.strategy.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {	
		orcamento.valor -= orcamento.valor * 0.02;
	}
}
