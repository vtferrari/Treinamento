package processadordestrings;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class ProcessadorTest {

    @Test
    public void testeSeProcessadorLeSomaStrings1Mais1() {
        Processador soma = new Processador();
        int resultado = (int) soma.processar("1 + 1");
        assertEquals(2, resultado);
    }

    @Test
    public void testeSeProcessadorLeMultiplicacaoStrings2Vezes5() {
        Processador soma = new Processador();
        int resultado = (int) soma.processar("2 * 5");
        assertEquals(10, resultado);
    }

    @Test
    public void testeSeProcessadorLeSomaStrings432Mais443() {
        Processador soma = new Processador();
        int resultado = (int) soma.processar("432+443");
        assertEquals(875, resultado);
    }

    @Test
    public void testeSeProcessadorLeMultiplicacaoStrings10Vezes23() {
        Processador soma = new Processador();
        int resultado = (int) soma.processar("10*23");
        assertEquals(230, resultado);
    }

    @Test
    public void testeSeProcessadorLeSomaStrings_abd_Mais_acd() {
        Processador concatena = new Processador();
        String resultado = (String) concatena.processar("abd + acd");
        assertEquals("abdacd", resultado);
    }

    @Test
    public void testeSeProcessadorLeSomaStrings_AbDSimbolos_Mais_ASimboloscD() {
        Processador concatena = new Processador();
        String resultado = (String) concatena.processar("AbD!@#+A!@#$%D");
        assertEquals("AbD!@#A!@#$%D", resultado);
//        nesse momento refatorei e criei duas classes somar e multiplicar
    }

    @Test
    public void testeSeProcessadorLeMultiplicaString_abd_Vezes2() {
        Processador concatena = new Processador();
        String resultado = (String) concatena.processar("abd * 2");
        assertEquals("abdabd", resultado);
    }

    @Test
    public void testeSeProcessadorLeMultiplicaString_Vinicius_Vezes11() {
        Processador concatena = new Processador();
        String resultado = (String) concatena.processar("Vinicius*11");
        assertEquals("ViniciusViniciusViniciusViniciusViniciusViniciusViniciusViniciusViniciusViniciusVinicius", resultado);
    }

    @Test
    public void testeSeProcessadorLeMultiplicaString_a_Vezes5() {
        Processador concatena = new Processador();
        String resultado = (String) concatena.processar("a * 5");
        assertEquals("aaaaa", resultado);
//        Nesse Momento Refatorei todo o processador e adicionei uma interface Operação
    }


    @Test
    public void testeSeProcessadorDivideStrings12Dividido4() {
        Processador divide = new Processador();
        int resultado = (int) divide.processar("12 / 4");
        assertEquals(3, resultado);
    }

    @Test
    public void testeSeProcessadorSubtraiStrings20Menos8() {
        Processador divide = new Processador();
        int resultado = (int) divide.processar("20 - 8");
        assertEquals(12, resultado);
    }

    @Test
    public void testeSeProcessadorSomaStrings12Mmais5() {
        Processador divide = new Processador();
        int resultado = (int) divide.processar("12 + 5");
        assertEquals(17, resultado);

//        SimpleFacturyOperação Cirado nesse momento
    }

    @Test
    public void testeSeProcessadorMultiplicarStrings12Vezes5() {
        Processador divide = new Processador();
        int resultado = (int) divide.processar("12 * 5");
        assertEquals(60, resultado);

    }
}