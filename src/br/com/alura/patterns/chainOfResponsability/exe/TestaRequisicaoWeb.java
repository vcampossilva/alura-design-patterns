package br.com.alura.patterns.chainOfResponsability.exe;

public class TestaRequisicaoWeb {

	public static void main(String[] args) {
		
		Conta conta = new Conta("Vinicius", 100.0);
		Requisicao requisicao = new Requisicao(Formato.PORCENTO);
		
		ProcessaRequisicao processaRequisicao = new ProcessaRequisicao();
		processaRequisicao.processa(requisicao, conta);
	}
}
