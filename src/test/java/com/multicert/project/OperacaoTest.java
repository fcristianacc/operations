package com.multicert.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class OperacaoTest {

    private Operacao classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = Mockito.mock(Operacao.class);
    }

    @After
    public void tearDown() throws Exception {
        classUnderTest = null;
    }

    @Test
    public void getIdentificador() {
        classUnderTest.getIdentificador();
    }

    @Test
    public void getOperacaoTipo() {
    }

    @Test
    public void setInputs() {
    }

    @Test
    public void getDescricaoOperacaoAtual() {
    }
}