package br.com.alura.patterns.observer;

import br.com.alura.patterns.builder.NotaFiscal;

public interface AcaoAposGerarNota {

	void executa(NotaFiscal nf);
	
}
