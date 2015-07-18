package br.com.alura.patterns.strategy;

public class TesteDeImpostos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadoraDeImpostos calculador = new CalculadoraDeImpostos();
		
		calculador.realizaCalculoICMS(orcamento, iss);
		calculador.realizaCalculoICMS(orcamento, icms);
	}
}
