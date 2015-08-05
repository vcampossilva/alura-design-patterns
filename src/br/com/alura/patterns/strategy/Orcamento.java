package br.com.alura.patterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.patterns.chainOfResponsability.Item;

public class Orcamento {

	public double valor;
	private final List<Item> itens;
	public static final int EM_APROVACAO = 1;
	public static final int APROVADO = 2;
	public static final int REPROVADO = 3;
	public static final int FINALIZADO = 4;
	
	private int estadoAtual;

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

	public void aplicaDescontoExtra() {
		if(estadoAtual == EM_APROVACAO) valor = valor - (valor * 0.05);
		else if(estadoAtual == APROVADO) valor = valor - (valor * 0.02);
		else throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}
}
