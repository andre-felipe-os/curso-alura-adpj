package alura.adpj.solid.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import alura.adpj.solid.rh.ValidacaoException;
import alura.adpj.solid.rh.model.Interno;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
	
	public void validar(Interno funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);

		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste não pode ser superior a quarenta por cento do salário.");
		}
	}

}
