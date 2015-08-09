package br.com.alura.patterns.builder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		
		//first mode
//		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 200.0), new ItemDaNota("item 2", 400.0));
//		
//		double valorTotal = 0;
//		for(ItemDaNota item : itens){
//			valorTotal += item.getValor();
//		}
//		
//		double impostos = valorTotal * 0.05;
//		
//		NotaFiscal nf = new NotaFiscal("razao social", "cnpj", Calendar.getInstance(), valorTotal, impostos, itens, "observacoes");
		
		//second mode
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		ItemDaNotaBuilder builderItem = new ItemDaNotaBuilder();
		
		builder.paraEmpresa("Caelum Ensino e Inovação")
		.comCnpj("12.345.678/0001/72")
		.comItem(builderItem.com("item 1").com(200.0).controi())
		.comItem(builderItem.com("item 2").com(400.0).controi())
		.comObservacoes("observacoes");
		
		
		NotaFiscal nf = builder.constroi();
		System.out.println(nf.getValorBruto());
		System.out.println(nf.getDataDeEmissao().getTimeInMillis());
	}
}
