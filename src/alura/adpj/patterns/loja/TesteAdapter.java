package alura.adpj.patterns.loja;

import java.math.BigDecimal;

import alura.adpj.patterns.loja.http.JavaHttpClient;
import alura.adpj.patterns.loja.orcamento.Orcamento;
import alura.adpj.patterns.loja.orcamento.RegistroDeOrcamento;

public class TesteAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
