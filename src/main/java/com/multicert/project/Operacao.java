package com.multicert.project;

import java.util.Objects;

public abstract class Operacao implements IOperacao {

    private final String identificador;
    private final OperacaoTipo type;

    protected boolean hasInput;
    protected int[] inputs;

    protected Operacao(String identificador, OperacaoTipo type) {

        if (Objects.isNull(identificador) || identificador.isEmpty()) {
            throw new IllegalArgumentException("invalid.argument.identificador");
        }

        this.identificador = identificador;
        this.type = type;
        this.hasInput = false;
    }

    @Override
    public String getIdentificador() {
        return identificador;
    }

    @Override
    public OperacaoTipo getOperacaoTipo() {
        return type;
    }

    @Override
    public void setInputs(int[] inputs) {

        if (Objects.isNull(inputs) || inputs.length == 0) {
            throw new IllegalArgumentException("invalid.input");
        }

        if (areAllInputsNaturals(inputs)) {
            this.inputs = inputs;
            this.hasInput = true;
        } else {
            throw new IllegalArgumentException("found.non.naturals");
        }

    }

    @Override
    public String getDescricaoOperacaoAtual() {

        StringBuilder sb = new StringBuilder();

        sb.append("Operacao:{");
        sb.append("identificador:" + identificador + ",");
        sb.append("tipo:" + type + ",");

        sb.append("inputs:[");
        if (hasInput) {
            for (int i = 0; i < inputs.length - 1; i++) {
                sb.append(inputs[i] + ",");
            }

            sb.append(inputs[inputs.length - 1]);
        }
        sb.append("]");

        sb.append("}");

        return sb.toString();
    }

    @Override
    public abstract int realizaOperacao();

    private boolean areAllInputsNaturals(int[] inputs) {

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] < 0) {
                return false;
            }
        }

        return true;
    }

}
