package alura.adpj.patterns.loja.desconto;

import java.math.BigDecimal;

import alura.adpj.patterns.loja.orcamento.Orcamento;

public class DescontoMaisDeCincoItens extends Desconto {
	
	public DescontoMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
	
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

}
