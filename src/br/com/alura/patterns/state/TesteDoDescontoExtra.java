package br.com.alura.patterns.state;

public class TesteDoDescontoExtra {

	public static void main(String[] args) {
		
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
		
//		reforma.aplicaDescontoExtra();
	}
}
