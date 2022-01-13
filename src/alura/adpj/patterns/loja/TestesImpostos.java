package alura.adpj.patterns.loja;

import java.math.BigDecimal;

import alura.adpj.patterns.loja.desconto.CalculadoraDeDescontos;
import alura.adpj.patterns.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
		
		CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
		System.out.println(calc.calcular(primeiro));
		System.out.println(calc.calcular(segundo));

	}

}
