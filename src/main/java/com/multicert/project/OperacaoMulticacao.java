package com.multicert.project;

public class OperacaoMulticacao extends Operacao {

    protected OperacaoMulticacao(String identificador) {
        super(identificador, OperacaoTipo.MULTIPLICACAO);
    }

    @Override
    public int realizaOperacao() {

        int sum = 0;
        if (super.hasInput) {
            sum = super.inputs[0];
            for (int i = 1; i < super.inputs.length; i++) {
                sum *= super.inputs[i];
            }
        }

        return sum;
    }

}
