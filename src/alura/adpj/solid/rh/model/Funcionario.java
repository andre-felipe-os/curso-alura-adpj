package alura.adpj.solid.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import alura.adpj.solid.rh.ValidacaoException;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;
	
	public void reajustarSalario(BigDecimal aumento) {
		BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);

		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste não pode ser superior a quarenta por cento do salário.");
		}

		this.salario = this.salario.add(aumento);
		this.dataUltimoReajuste = LocalDate.now();
	}

}
