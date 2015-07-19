package br.com.alura.patterns.templateMethod.relatory;

import java.util.List;

import br.com.alura.patterns.chainOfResponsability.exe.Conta;

public abstract class Relatorio {

	protected abstract void cabecalho();
	
	protected abstract void rodape();
	
	protected abstract void corpo(List<Conta> contas);
	
	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}
}
