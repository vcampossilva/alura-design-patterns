package br.com.alura.patterns.state;

import br.com.alura.patterns.strategy.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
	}

}
