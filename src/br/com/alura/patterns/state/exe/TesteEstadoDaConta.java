package br.com.alura.patterns.state.exe;

public class TesteEstadoDaConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta(500.0);
		conta.sacar(200);
		conta.sacar(100);
		conta.depositar(500);
		conta.sacar(5000);
		conta.sacar(200);
	}
}
