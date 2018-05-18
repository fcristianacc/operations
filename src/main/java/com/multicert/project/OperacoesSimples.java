package com.multicert.project;

public class OperacoesSimples extends OperacoesNaturais {

    @Override
    protected OperacaoTipo[] getAllowedOperacoes() {
        return new OperacaoTipo[]{OperacaoTipo.SOMA, OperacaoTipo.SUBTRACAO, OperacaoTipo.MULTIPLICACAO};
    }

}
