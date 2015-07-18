package br.com.alura.patterns.chainOfResponsability.exe;

public class CSVResposta implements Resposta{

	private Resposta resposta;
	
	public CSVResposta(Resposta resposta) {
		this.resposta = resposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV){
			System.out.println(conta.getTitular() + ";" + conta.getSaldo());
		}else{
			resposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
