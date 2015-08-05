package br.com.alura.patterns.state;

import br.com.alura.patterns.state.Orcamento;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	
    void reprova(Orcamento orcamento);
    
    void finaliza(Orcamento orcamento);
}
