package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.impostos.CalculadoraDeImpostos;
import br.com.alura.loja.impostos.ICMS;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Testes {

    public static void main(String args[]) {
        //PEDIDO


        //Desconto
        Orcamento o1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento o2 = new Orcamento(new BigDecimal("1000"), 1);

        //testesDesconto(o1, o2);
    }

    private static void testesPedido(String args[]) {

        String cliente = args[0];
        BigDecimal vlOrcamento = new BigDecimal(args[1]);
        Integer qtdItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, vlOrcamento, qtdItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
        handler.execute(geraPedido);

    }


    private static void testesDesconto(Orcamento o1, Orcamento o2) {
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(o1));
        System.out.println(calculadora.calcular(o2));
    }

    private static void testesImposto(Orcamento orcamento) {
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }

}
