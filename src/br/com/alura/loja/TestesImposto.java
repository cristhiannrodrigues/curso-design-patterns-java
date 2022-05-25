package br.com.alura.loja;

import br.com.alura.loja.impostos.CalculadoraDeImpostos;
import br.com.alura.loja.impostos.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {

    public static void main(String args[]) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
    }

}
