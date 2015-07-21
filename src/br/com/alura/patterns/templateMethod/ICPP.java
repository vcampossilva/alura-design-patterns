package br.com.alura.patterns.templateMethod;

import br.com.alura.patterns.chainOfResponsability.Item;
import br.com.alura.patterns.strategy.Imposto;
import br.com.alura.patterns.strategy.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional{

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICPP() {}
	
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100reaisNo(orcamento);
	}
	
	private boolean temItemMaiorQue100reaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100) return true;			
		} 
		return false;
	}
}
