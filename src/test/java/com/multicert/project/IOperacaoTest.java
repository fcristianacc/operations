package com.multicert.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        IOperacaoTest.OperacaoSomaTest.class,
        IOperacaoTest.OperacaoSubtracaoTest.class,
        IOperacaoTest.OperacaoMultiplicacaoTest.class})
@RunWith(Suite.class)
public class IOperacaoTest {

    private static final int[] naturals = new int[]{1, 2, 3, 4, 5, 6};
    private static final int[] nonNaturals = new int[]{1, 2, 3, -4, 5, 6};

    /**
     * Operacao Soma
     */
    public static class OperacaoSomaTest {

        private final String identificador = "TC_ID1";

        private IOperacao classUnderTest;

        @Before
        public void setUp() {
            classUnderTest = new OperacaoSoma(identificador);
        }

        @After
        public void tearDown() {
            classUnderTest = null;
        }

        @Test
        public void sumOperationWithNaturals_TC_ID1_1() {

            Assert.assertNotNull(classUnderTest);

            classUnderTest.setInputs(naturals);

            Assert.assertEquals(21, classUnderTest.realizaOperacao());

        }

        @Test
        public void getDescricaoOperacaoAtualWithInput_TC_ID1_2() {

            Assert.assertNotNull(classUnderTest);

            classUnderTest.setInputs(naturals);

            Assert.assertEquals(
                    "Operacao:{identificador:" + identificador + ",tipo:SOMA,inputs:[1,2,3,4,5,6]}",
                    classUnderTest.getDescricaoOperacaoAtual()
            );

        }

        @Test
        public void getDescricaoOperacaoAtualWithoutInput_TC_ID1_3() {

            Assert.assertNotNull(classUnderTest);

            Assert.assertEquals(
                    "Operacao:{identificador:" + identificador + ",tipo:SOMA,inputs:[]}",
                    classUnderTest.getDescricaoOperacaoAtual()
            );

        }

        @Test(expected = IllegalArgumentException.class)
        public void setInputWithNonNaturals_TC_ID1_4() {

            Assert.assertNotNull(classUnderTest);

            classUnderTest.setInputs(nonNaturals);

            Assert.fail("non.naturals.allowed");

        }

    }

    /**
     * Operacao Subtracao
     */
    public static class OperacaoSubtracaoTest {

        private final String identificador = "TC_ID2";

        private IOperacao classUnderTest;

        @Before
        public void setUp() {
            classUnderTest = new OperacaoSubtracao(identificador);
        }

        @After
        public void tearDown() {
            classUnderTest = null;
        }

        @Test
        public void subtractionOperationWithNaturals_TC_ID2_1() {

            Assert.assertNotNull(classUnderTest);

            classUnderTest.setInputs(naturals);

            Assert.assertEquals(-19, classUnderTest.realizaOperacao());

        }

        @Test
        public void getDescricaoOperacaoAtualWithInput_TC_ID2_2() {

            Assert.assertNotNull(classUnderTest);

            classUnderTest.setInputs(naturals);

            Assert.assertEquals(
                    "Operacao:{identificador:" + identificador + ",tipo:SUBTRACAO,inputs:[1,2,3,4,5,6]}",
                    classUnderTest.getDescricaoOperacaoAtual()
            );

        }

        @Test
        public void getDescricaoOperacaoAtualWithoutInput_TC_ID2_3() {

            Assert.assertNotNull(classUnderTest);

            Assert.assertEquals(
                    "Operacao:{identificador:" + identificador + ",tipo:SUBTRACAO,inputs:[]}",
                    classUnderTest.getDescricaoOperacaoAtual()
            );

        }

        @Test(expected = IllegalArgumentException.class)
        public void setInputWithNonNaturals_TC_ID2_4() {

            Assert.assertNotNull(classUnderTest);

            classUnderTest.setInputs(nonNaturals);

            Assert.fail("non.naturals.allowed");

        }

    }

    /**
     * Operacao Multiplicacao
     */
    public static class OperacaoMultiplicacaoTest {

        private final String identificador = "TC_ID3";

        private IOperacao classUnderTest;

        @Before
        public void setUp() {
            classUnderTest = new OperacaoMulticacao(identificador);
        }

        @After
        public void tearDown() {
            classUnderTest = null;
        }

        @Test
        public void performMultiplicationOperationWithNaturals_TC_ID3_1() {

            Assert.assertNotNull(classUnderTest);

            classUnderTest.setInputs(naturals);

            Assert.assertEquals(720, classUnderTest.realizaOperacao());

        }

        @Test
        public void getDescricaoOperacaoAtualWithInput_TC_ID3_2() {

            Assert.assertNotNull(classUnderTest);

            classUnderTest.setInputs(naturals);

            Assert.assertEquals(
                    "Operacao:{identificador:" + identificador + ",tipo:MULTIPLICACAO,inputs:[1,2,3,4,5,6]}",
                    classUnderTest.getDescricaoOperacaoAtual()
            );

        }

        @Test
        public void getDescricaoOperacaoAtualWithoutInput_TC_ID3_3() {

            Assert.assertNotNull(classUnderTest);

            Assert.assertEquals(
                    "Operacao:{identificador:" + identificador + ",tipo:MULTIPLICACAO,inputs:[]}",
                    classUnderTest.getDescricaoOperacaoAtual()
            );

        }

        @Test(expected = IllegalArgumentException.class)
        public void setInputWithNonNaturals_TC_ID3_4() {

            Assert.assertNotNull(classUnderTest);

            classUnderTest.setInputs(nonNaturals);

            Assert.fail("non.naturals.allowed");

        }

    }

}