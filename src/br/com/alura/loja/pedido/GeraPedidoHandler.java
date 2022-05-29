package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //Construtor com Injeção de Dependências: repository, services ...

    public void execute(GeraPedido dados) {
        Orcamento o1 = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), o1);
        System.out.println("Salvar Pedido no BD");
        System.out.println("Enviar Email com Dados do Pedido");
    }

}
