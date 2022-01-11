package alura.adpj.patterns.loja.imposto;

import java.math.BigDecimal;

import alura.adpj.patterns.loja.orcamento.Orcamento;

public interface ImpostoAplicavel {
	
	BigDecimal calcular(Orcamento orcamento);

}
