package br.com.alura.patterns.strategy;

public abstract class Imposto {

	protected final Imposto outroImposto;
	
	public Imposto(Imposto outroImposto){
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {
		outroImposto = null;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if(outroImposto == null) return 0;
		return outroImposto.calcula(orcamento);
	}
}
