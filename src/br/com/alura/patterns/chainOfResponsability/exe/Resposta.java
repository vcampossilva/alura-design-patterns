package br.com.alura.patterns.chainOfResponsability.exe;

public interface Resposta {

	void responde(Requisicao req, Conta conta);
	
	void setProxima(Resposta resposta);
}
