package com.multicert.project;

public class OperacaoSoma extends Operacao {

    public OperacaoSoma(String identificador) {
        super(identificador, OperacaoTipo.SOMA);
    }

    @Override
    public int realizaOperacao() {

        int sum = 0;
        if(super.hasInput) {
            sum = super.inputs[0];
            for (int i = 1; i < super.inputs.length; i++) {
                sum += super.inputs[i];
            }

        }

        return sum;
    }

}
