package br.com.alura.patterns.observer;

import br.com.alura.patterns.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("salvei no banco");
	}
	
}
