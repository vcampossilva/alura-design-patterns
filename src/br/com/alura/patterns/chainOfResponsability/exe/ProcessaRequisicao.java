package br.com.alura.patterns.chainOfResponsability.exe;

public class ProcessaRequisicao {

	public void processa(Requisicao requisicao, Conta conta){
		
//		Resposta semResposta = new SemResposta(null);
		Resposta porcentagemResposta = new PorcentagemResposta();
		Resposta csvResposta = new CSVResposta(porcentagemResposta);
		Resposta xmlResposta = new XMLResposta(csvResposta);
		
//		xmlResposta.setProxima(csvResposta);
//		csvResposta.setProxima(porcentagemResposta);
//		porcentagemResposta.setProxima(semResposta);
		
		xmlResposta.responde(requisicao, conta);
		
	}
}
