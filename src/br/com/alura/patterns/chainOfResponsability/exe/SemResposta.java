package br.com.alura.patterns.chainOfResponsability.exe;

public class SemResposta implements Resposta {

	public SemResposta(Resposta resposta) {
		
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		
	}

}
