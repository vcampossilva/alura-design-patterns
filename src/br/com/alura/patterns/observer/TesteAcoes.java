package br.com.alura.patterns.observer;

import br.com.alura.patterns.builder.ItemDaNota;
import br.com.alura.patterns.builder.NotaFiscal;
import br.com.alura.patterns.builder.NotaFiscalBuilder;

public class TesteAcoes {

	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());
		builder.adicionaAcao(new NotaFiscalDao());
		
		NotaFiscal nf = builder
				.paraEmpresa("Caelum")
				.comCnpj("123")
				.comItem(new ItemDaNota("item", 100))
				.comObservacoes("obs")
				.constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
