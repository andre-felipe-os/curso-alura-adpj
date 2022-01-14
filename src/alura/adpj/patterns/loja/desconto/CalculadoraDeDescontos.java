package alura.adpj.patterns.loja.desconto;

import java.math.BigDecimal;

import alura.adpj.patterns.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoValorMaiorQueQuinhentos(
				new DescontoMaisDeCincoItens(
						new SemDesconto()));
		
		return cadeiaDeDescontos.calcular(orcamento);
	}

}
