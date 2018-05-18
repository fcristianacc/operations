package com.multicert.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IOperacoesNaturaisTest {

    private static final String identificador = "TC_ID4";

    private IOperacoesNaturais classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new OperacoesSimples();
    }

    @After
    public void tearDown() throws Exception {
        classUnderTest = null;
    }

    @Test
    public void adicionaOperacaoSoma() {

        classUnderTest.adicionaOperacao(new OperacaoSoma(identificador));
        Assert.assertEquals(21, classUnderTest.executaOperacao(OperacaoTipo.SOMA, new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void adicionaOperacaoSubtracao() {

        classUnderTest.adicionaOperacao(new OperacaoSubtracao(identificador));
        Assert.assertEquals(-19, classUnderTest.executaOperacao(OperacaoTipo.SUBTRACAO, new int[]{1, 2, 3, 4, 5, 6}));

    }

    @Test
    public void adicionaOperacaoMultiplicacao() {

        classUnderTest.adicionaOperacao(new OperacaoMulticacao(identificador));
        Assert.assertEquals(720, classUnderTest.executaOperacao(OperacaoTipo.MULTIPLICACAO, new int[]{1, 2, 3, 4, 5, 6}));

    }

    @Test
    public void listaAllowedOperacoes() {
        classUnderTest.listaOperacoes();
    }

    @Test
    public void executaOperacao() {
    }

}