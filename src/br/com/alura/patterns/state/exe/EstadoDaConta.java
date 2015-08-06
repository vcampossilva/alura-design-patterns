package br.com.alura.patterns.state.exe;

public interface EstadoDaConta {

	public void saca(Conta conta, double valorSaque);
	
	public void deposita(Conta conta, double valorDeposito);
}
