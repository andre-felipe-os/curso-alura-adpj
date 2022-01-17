package alura.adpj.patterns.loja.orcamento.situacao;

import alura.adpj.patterns.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
