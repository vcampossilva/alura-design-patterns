package br.com.alura.patterns.state.exe;

public class Negativo implements EstadoDaConta{

	@Override
	public void saca(Conta conta, double valorSaque) {
		throw new RuntimeException("Saque não permitido!");
	}

	@Override
	public void deposita(Conta conta, double valorDeposito) {
		conta.saldo += valorDeposito * 0.95;
		if(conta.saldo > 0) conta.estadoDaConta = new Positivo();
	}

}
