package br.com.alura.patterns.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.patterns.observer.AcaoAposGerarNota;
import br.com.alura.patterns.observer.EnviadorDeEmail;
import br.com.alura.patterns.observer.Impressora;
import br.com.alura.patterns.observer.NotaFiscalDao;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

	public NotaFiscalBuilder() {
		this.data = Calendar.getInstance();
		this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}
	
	public void adicionaAcao(AcaoAposGerarNota acao){
		this.todasAcoesASeremExecutadas.add(acao);
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;		
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		this.todosItens.add(item);
		this.valorBruto += item.getValor();
		this.impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data) {
		this.data = data; 
		return this;
	}
	
	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
		
		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executa(nf);
		}
		
		return nf;
	}	
}
