package alura.adpj.solid.rh.service.reajuste;

import java.math.BigDecimal;

import alura.adpj.solid.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
