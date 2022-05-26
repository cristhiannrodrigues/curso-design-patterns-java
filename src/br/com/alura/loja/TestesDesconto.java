package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.impostos.CalculadoraDeImpostos;
import br.com.alura.loja.impostos.ICMS;
import br.com.alura.loja.impostos.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDesconto {

    public static void main(String args[]) {
        Orcamento primeiro = new Orcamento(new BigDecimal("100"), 1);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        Desconto(segundo);
    }

    private static void Desconto(Orcamento orcamento) {
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento));
    }

    private static void Imposto(Orcamento orcamento) {
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }

}
