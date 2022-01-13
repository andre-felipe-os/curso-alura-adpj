package alura.adpj.patterns.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	
	public Orcamento(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidadeItens = quantidade;
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	
	public int getQuantidadeItens() {
		return this.quantidadeItens;
	}

}
