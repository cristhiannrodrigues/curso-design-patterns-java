package br.com.alura.loja.impostos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcular(Orcamento orcamento);

}
