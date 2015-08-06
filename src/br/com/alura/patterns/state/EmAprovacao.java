package br.com.alura.patterns.state;

import br.com.alura.patterns.state.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento{

	private boolean aplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {		
		if(!aplicado){ orcamento.valor -= orcamento.valor * 0.05; aplicado = true;}
		else throw new RuntimeException("Desconto já aplicado!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");		
	}

}
