package br.com.alura.patterns.templateMethod;

import br.com.alura.patterns.strategy.Imposto;
import br.com.alura.patterns.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	public TemplateDeImpostoCondicional(Imposto imposto) {
		super(imposto);
	}
	
	public TemplateDeImpostoCondicional() {}
	
	@Override
	public double calcula(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento) + outroImposto.calcula(orcamento);
		}else{
			return minimaTaxacao(orcamento) + outroImposto.calcula(orcamento);
		}		
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
