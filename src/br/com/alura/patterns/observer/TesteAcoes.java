package br.com.alura.patterns.observer;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.patterns.builder.ItemDaNota;
import br.com.alura.patterns.builder.NotaFiscal;
import br.com.alura.patterns.builder.NotaFiscalBuilder;

public class TesteAcoes {

	public static void main(String[] args) {
		
		List<AcaoAposGerarNota> todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>(); 
		todasAcoesASeremExecutadas.add(new EnviadorDeEmail());
		todasAcoesASeremExecutadas.add(new EnviadorDeSms());
		todasAcoesASeremExecutadas.add(new Impressora());
		todasAcoesASeremExecutadas.add(new NotaFiscalDao());
		todasAcoesASeremExecutadas.add(new Multiplicador(2));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(todasAcoesASeremExecutadas);
//		builder.adicionaAcao(new EnviadorDeEmail());
//		builder.adicionaAcao(new EnviadorDeSms());
//		builder.adicionaAcao(new Impressora());
//		builder.adicionaAcao(new NotaFiscalDao());
//		builder.adicionaAcao(new Multiplicador(2));
		
		NotaFiscal nf = builder
				.paraEmpresa("Caelum")
				.comCnpj("123")
				.comItem(new ItemDaNota("item", 100))
				.comObservacoes("obs")
				.constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
