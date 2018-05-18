package com.multicert.project;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        IOperacoesNaturais operacoes = new OperacoesSimples();

        int resultado;
        int inputs[] = new int[]{4, 5};

        resultado = operacoes.executaOperacao(OperacaoTipo.SOMA, inputs);
        resultado = operacoes.executaOperacao(OperacaoTipo.SUBTRACAO, inputs);
        resultado = operacoes.executaOperacao(OperacaoTipo.MULTIPLICACAO, inputs);

//        int fatorialInput[] = new int[]{5};
//
//        IOperacao fatorial = new OperationFactorial();
//
//        operacoes.adicionaOperacao(fatorial);
//
//        resultado = operacoes.executaOperacao("fatorial", inputs);

    }
}
