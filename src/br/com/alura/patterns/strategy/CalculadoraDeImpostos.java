package br.com.alura.patterns.strategy;

public class CalculadoraDeImpostos {

	public void realizaCalculoICMS(Orcamento orcamento, Imposto impostoQualquer){
		double icms = impostoQualquer.calcula(orcamento);
		System.out.println(icms);
	}	

}
