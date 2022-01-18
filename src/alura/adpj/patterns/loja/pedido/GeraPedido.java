package alura.adpj.patterns.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import alura.adpj.patterns.loja.orcamento.Orcamento;

public class GeraPedido {
	
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	
	public GeraPedido(String cliente, BigDecimal valor, int quantidade) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
		this.valorOrcamento = valor;
		this.quantidadeItens = quantidade;
	}
	
	public void executa() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
		Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no banco de dados.");
		System.out.println("Enviar e-mail com dados do pedido.");
	}

}
