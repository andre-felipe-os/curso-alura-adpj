package alura.adpj.solid.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario {
	
	private String empresa;

	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		super(nome, cpf, cargo, salario);
		this.empresa = empresa;
	}
	
	public String getEmpresa() {
		return this.empresa;
	}

}
