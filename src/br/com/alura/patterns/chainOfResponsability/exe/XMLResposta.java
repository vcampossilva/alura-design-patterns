package br.com.alura.patterns.chainOfResponsability.exe;

public class XMLResposta implements Resposta {

	private Resposta resposta;
	
	public XMLResposta(Resposta resposta) {
		this.resposta = resposta;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.XML){
			System.out.println("<conta>");
			System.out.println("	<titular>" + conta.getTitular() + "</titular>");
			System.out.println("    <saldo>" + conta.getSaldo() + "</saldo>");
			System.out.println("</conta>");
		}else{
			resposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
