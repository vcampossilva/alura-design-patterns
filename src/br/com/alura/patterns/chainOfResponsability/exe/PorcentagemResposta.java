package br.com.alura.patterns.chainOfResponsability.exe;

public class PorcentagemResposta implements Resposta{

	private Resposta resposta;
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.PORCENTO){
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		}else{
			resposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;		
	}
	
}
