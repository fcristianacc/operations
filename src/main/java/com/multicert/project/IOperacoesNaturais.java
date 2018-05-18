package com.multicert.project;

public interface IOperacoesNaturais {

    /**
     * Permite adicionar uma nova operacao
     *
     * @param operacao
     */
    void adicionaOperacao(IOperacao operacao);

    /**
     * Permite lista as operações disponíveis
     */
    OperacaoTipo[] listaOperacoes();

    /**
     * permite executar uma operação de acordo com o tipo e valore passados
     *
     * @param tipo
     * @param valores
     * @return
     * @throws IllegalArgumentException
     */
    int executaOperacao(OperacaoTipo tipo, int[] valores) throws IllegalArgumentException;

}
