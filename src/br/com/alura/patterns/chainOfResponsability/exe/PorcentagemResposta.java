package br.com.alura.patterns.chainOfResponsability.exe;

public class PorcentagemResposta implements Resposta{

	private Resposta resposta;
	
	public PorcentagemResposta(Resposta resposta) {
		this.resposta = resposta;
	}

	public PorcentagemResposta() {
		resposta = null;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.PORCENTO){
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		}else if (resposta != null){
			resposta.responde(req, conta);
		}else{
			
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;		
	}
	
}
