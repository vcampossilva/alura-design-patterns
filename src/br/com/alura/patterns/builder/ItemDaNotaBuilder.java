package br.com.alura.patterns.builder;

public class ItemDaNotaBuilder {

	private String nome;
	private double valor;

	public ItemDaNotaBuilder com(String nome) {
		this.nome = nome;
		return this;
	}
	
	public ItemDaNotaBuilder com(double valor){
		this.valor = valor;
		return this;
	}
	
	public ItemDaNota controi() {
		return new ItemDaNota(this.nome, this.valor);
	}
}
