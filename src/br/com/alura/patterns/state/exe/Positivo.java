package br.com.alura.patterns.state.exe;

public class Positivo implements EstadoDaConta{

	@Override
	public void saca(Conta conta, double valorSaque) {
		conta.saldo -= valorSaque;
		if (conta.saldo < 0) conta.estadoDaConta = new Negativo(); 
	}

	@Override
	public void deposita(Conta conta, double valorDeposito) {
		conta.saldo += valorDeposito * 0.98;
	}	

}
