package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer qtdItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, Integer qtdItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
    }

    public void executa() {

        Orcamento o1 = new Orcamento(this.valorOrcamento, this.qtdItens);

        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), o1);
        System.out.println("Salvar Pedido no BD");
        System.out.println("Enviar Email com Dados do Pedido");

    }

}
