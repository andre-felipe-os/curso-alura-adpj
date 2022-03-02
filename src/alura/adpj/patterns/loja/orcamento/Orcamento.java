package alura.adpj.patterns.loja.orcamento;

import java.math.BigDecimal;

import alura.adpj.patterns.loja.orcamento.situacao.EmAnalise;
import alura.adpj.patterns.loja.orcamento.situacao.Finalizado;
import alura.adpj.patterns.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidadeItens = quantidade;
		this.situacao = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	
	public int getQuantidadeItens() {
		return this.quantidadeItens;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		// TODO Auto-generated method stub
		return situacao instanceof Finalizado;
	}

}
