package com.multicert.project;

import java.util.HashMap;
import java.util.Map;

public abstract class OperacoesNaturais implements IOperacoesNaturais {

    private final OperacaoTipo[] allowedOperacoes;

    private Map<OperacaoTipo, IOperacao> operacoes;

    protected OperacoesNaturais() {
        this.allowedOperacoes = getAllowedOperacoes();
        this.operacoes = new HashMap<>(0);
    }

    protected abstract OperacaoTipo[] getAllowedOperacoes();

    @Override
    public void adicionaOperacao(IOperacao operacao) {

        boolean unallowedOperation = true;
        for (int i = 0; i < allowedOperacoes.length; i++) {
            if (allowedOperacoes[i].equals(operacao.getOperacaoTipo())) {
                operacoes.put(operacao.getOperacaoTipo(), operacao);
                unallowedOperation = false;
            }
        }

        if (unallowedOperation) {
            throw new IllegalArgumentException("operation.type.not.allowed");
        }

    }

    @Override
    public OperacaoTipo[] listaOperacoes() {
        return getAllowedOperacoes();
    }

    @Override
    public int executaOperacao(OperacaoTipo tipo, int[] valores) throws IllegalArgumentException {

        if (operacoes.containsKey(tipo)) {
            IOperacao operacao = operacoes.get(tipo);
            operacao.setInputs(valores);
            return operacao.realizaOperacao();
        }

        throw new IllegalArgumentException("operation.type.not.allowed");
    }

}
