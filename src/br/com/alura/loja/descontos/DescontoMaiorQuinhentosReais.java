package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaiorQuinhentosReais extends Desconto {

    public DescontoMaiorQuinhentosReais(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarDesconto(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal("0.05"));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

}
