package br.com.alura.patterns.observer;

import br.com.alura.patterns.builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("nota impressa");
	}
	
}
