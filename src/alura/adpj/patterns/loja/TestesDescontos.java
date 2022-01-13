package alura.adpj.patterns.loja;

import java.math.BigDecimal;

import alura.adpj.patterns.loja.imposto.CalculadoraDeImpostos;
import alura.adpj.patterns.loja.imposto.ISS;
import alura.adpj.patterns.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
		
		System.out.println(calc.calcular(orcamento, new ISS()));

	}

}
