package alura.adpj.solid.rh.service.reajuste;

import java.math.BigDecimal;

import alura.adpj.solid.rh.model.Interno;

public interface ValidacaoReajuste {
	
	void validar(Interno funcionario, BigDecimal aumento);

}
