package alura.adpj.patterns.loja.imposto;

import java.math.BigDecimal;

import alura.adpj.patterns.loja.orcamento.Orcamento;

public class ISS implements ImpostoAplicavel {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
	
}
