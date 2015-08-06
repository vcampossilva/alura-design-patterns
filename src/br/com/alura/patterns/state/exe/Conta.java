package br.com.alura.patterns.state.exe;

public class Conta {

	protected double saldo;
	
	protected EstadoDaConta estadoDaConta;
	
	public Conta(double saldo) {
		this.saldo = saldo;
		if (this.saldo < 0) estadoDaConta = new Negativo(); else estadoDaConta = new Positivo(); 
	}
	
	public void sacar(double valorSaque){
		estadoDaConta.saca(this, valorSaque);
	}
	
	public void depositar(double valorDeposito){
		estadoDaConta.deposita(this, valorDeposito);
	}	

}
