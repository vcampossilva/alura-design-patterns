package br.com.alura.patterns.decorator;

import br.com.alura.patterns.strategy.Imposto;
import br.com.alura.patterns.strategy.Orcamento;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto(Imposto imposto){
		super(imposto);
	}
	
	public ImpostoMuitoAlto() {}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20;
	}

}
