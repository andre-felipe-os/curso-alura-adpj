package alura.adpj.solid.rh.model;

import java.math.BigDecimal;

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	protected Cargo cargo;
	protected BigDecimal salario;
	
	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}

}
