package br.com.alura.patterns.templateMethod.relatory;

import java.util.Arrays;

import br.com.alura.patterns.chainOfResponsability.exe.Conta;

public class TesteRelatorio {
	
	public static void main(String[] args) {
		
		Conta vinicius = new Conta ("Vinicius", 100.0);
		Conta felipe = new Conta ("Felipe", 100.0);
		Conta rodrigo = new Conta ("Rodrigo", 100.0);
		
		RelatorioSimples simples = new RelatorioSimples();		
		simples.imprime(Arrays.asList(vinicius, felipe, rodrigo));
		
		RelatorioComplexo complexo = new RelatorioComplexo();
		complexo.imprime(Arrays.asList(vinicius, felipe, rodrigo));
	}

}
