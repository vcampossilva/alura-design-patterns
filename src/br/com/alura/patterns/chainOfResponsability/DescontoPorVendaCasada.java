package br.com.alura.patterns.chainOfResponsability;

public class DescontoPorVendaCasada implements Desconto{
	
	private Desconto proximo;
	
	@Override
	public double desconto(Orcamento orcamento) {
		
		if(existe("LAPIS", orcamento) && existe("CANETA", orcamento)){
			return orcamento.getValor() * 0.05;
		}else		
			return proximo.desconto(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;		
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
	
}
