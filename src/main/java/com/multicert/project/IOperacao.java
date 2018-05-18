package com.multicert.project;

public interface IOperacao {

    /**
     * Retorna o identificador da operação.
     *
     * @return
     */
    String getIdentificador();

    /**
     * Retorna o tipo da operação.
     *
     * @return
     */
    OperacaoTipo getOperacaoTipo();

    /**
     * Atribui os inputs da operaçao a realizar.
     *
     * @param inputs
     */
    void setInputs(int[] inputs);

    /**
     * Devolve a descrição da operação.
     *
     * @return
     */
    String getDescricaoOperacaoAtual();

    /**
     * Realiza a operacao
     *
     * @return
     */
    int realizaOperacao();

}