package alura.adpj.patterns.loja.pedido;

import java.time.LocalDateTime;

import alura.adpj.patterns.loja.orcamento.Orcamento;

public class Pedido {
	
	private String cliente;
	private LocalDateTime data;
	private Orcamento orcamento;
	
	public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
		this.data = data;
		this.orcamento = orcamento;
	}

}
