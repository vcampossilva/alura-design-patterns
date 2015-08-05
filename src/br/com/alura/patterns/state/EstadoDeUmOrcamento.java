package br.com.alura.patterns.state;

import br.com.alura.patterns.strategy.Orcamento;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
}
