package br.com.alura.patterns.observer;

import br.com.alura.patterns.builder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota{

	private double fator;
	
	public Multiplicador(double fator) {
	
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Imprimindo o multiplicador -> " + nf.getValorBruto() * fator);		
	}

}
