package alura.adpj.solid.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import alura.adpj.solid.rh.ValidacaoException;
import alura.adpj.solid.rh.model.Interno;

public class ValidacaoPeriodicidadeEntreReajustes {
	
	public void validar(Interno funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo seis meses.");
		}
	}

}
