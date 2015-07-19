package br.com.alura.patterns.templateMethod;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.patterns.chainOfResponsability.Item;
import br.com.alura.patterns.strategy.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		List<String> outroOrcamento = new ArrayList<String>();

        for(Item item : orcamento.getItens()) {
          if(outroOrcamento.contains(item.getNome())) return true;
          else outroOrcamento.add(item.getNome());
        }
		return false;
	}	
	
}
