package br.com.alura.patterns.decorator.exe;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.patterns.chainOfResponsability.exe.Conta;

public class FiltroMesmoMes extends Filtro {

	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMesmoMes() {
		super();
	}

	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if (conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
				&& conta.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
				filtrada.add(conta);
			}
		}
		filtrada.addAll(proximo(contas));
		return filtrada;
	}
}
