package alura.adpj.solid.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Interno extends Funcionario {
	
	private LocalDate dataUltimoReajuste;
	
	public Interno(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		super(nome, cpf, cargo, salario);
	}
	
	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}

	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
	}

}
