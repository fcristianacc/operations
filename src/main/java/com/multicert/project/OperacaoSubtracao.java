package com.multicert.project;

public class OperacaoSubtracao extends Operacao {

    protected OperacaoSubtracao(String identificador) {
        super(identificador, OperacaoTipo.SUBTRACAO);
    }

    @Override
    public int realizaOperacao() {

        int sum = 0;
        if (super.hasInput) {
            sum = super.inputs[0];
            for (int i = 1; i < super.inputs.length; i++) {
                sum -= super.inputs[i];
            }
        }

        return sum;
    }

}
