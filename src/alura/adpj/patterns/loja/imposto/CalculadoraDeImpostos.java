package alura.adpj.patterns.loja.imposto;

import java.math.BigDecimal;

import alura.adpj.patterns.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, ImpostoAplicavel imposto) {
		return imposto.calcular(orcamento);
	}

}
