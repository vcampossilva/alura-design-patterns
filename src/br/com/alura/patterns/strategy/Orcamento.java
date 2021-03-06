package br.com.alura.patterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.patterns.chainOfResponsability.Item;

public class Orcamento {

	private double valor;
	private final List<Item> itens;
	
	public Orcamento(double valor){
		this.valor = valor;
		itens = new ArrayList<Item>();
		
	}

	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item){
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
}
