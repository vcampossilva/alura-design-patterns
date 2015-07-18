package br.com.alura.patterns.chainOfResponsability.exe;

public class ProcessaRequisicao {

	public void processa(Requisicao requisicao, Conta conta){
		
		Resposta xmlResposta = new XMLResposta();
		Resposta csvResposta = new CSVResposta();
		Resposta porcentagemResposta = new PorcentagemResposta();
		Resposta semResposta = new SemResposta();
		
		xmlResposta.setProxima(csvResposta);
		csvResposta.setProxima(porcentagemResposta);
		porcentagemResposta.setProxima(semResposta);
		
		xmlResposta.responde(requisicao, conta);
		
	}
}
