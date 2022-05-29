package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.impostos.CalculadoraDeImpostos;
import br.com.alura.loja.impostos.ICMS;
import br.com.alura.loja.orcamento.Orcamento;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;

public class Testes {

    public static void main(String args[]) {
        Orcamento o1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento o2 = new Orcamento(new BigDecimal("1000"), 1);

        Desconto(o1, o2);
    }

    private static void Desconto(Orcamento o1, Orcamento o2) {
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(o1));
        System.out.println(calculadora.calcular(o2));
    }

    private static void Imposto(Orcamento orcamento) {
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }

}
