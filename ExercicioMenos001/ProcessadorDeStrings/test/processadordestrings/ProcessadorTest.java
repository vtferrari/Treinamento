package processadordestrings;

import static org.junit.Assert.*;
import org.junit.Test;

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
    public void testeSeProcessadorDivide12Dividido4() {
        Processador divide = new Processador();
        int resultado = (int) divide.processar("12 / 4");
        assertEquals(3, resultado);
    }

    @Test
    public void testeSeProcessadorSubtrai20Menos8() {
        Processador divide = new Processador();
        int resultado = (int) divide.processar("20 - 8");
        assertEquals(12, resultado);
    }

    @Test
    public void testeSeProcessadorSoma12Mmais5() {
        Processador divide = new Processador();
        int resultado = (int) divide.processar("12 + 5");
        assertEquals(17, resultado);

//        SimpleFacturyOperação Cirado nesse momento
    }

    @Test
    public void testeSeProcessadorMultiplicar12Vezes5() {
        Processador divide = new Processador();
        int resultado = (int) divide.processar("12 * 5");
        assertEquals(60, resultado);

    }
    @Test
    public void testeSeProcessadorMultiplicarStringsbVezes5() {
        Processador multiplica = new Processador();
        String resultado = (String) multiplica.processar("b * 5");
        assertEquals("bbbbb", resultado);

    }
    @Test
    public void testeSeProcessadorMultiplicarStrings_bnm_mais_mpo() {
        Processador multiplica = new Processador();
        String resultado = (String) multiplica.processar("bnm + mpo");
        assertEquals("bnmmpo", resultado);

    }
    
    @Test
    public void testeSeProcessadorCriaInstanciaDeCarro() {
        Processador instancia = new Processador();
        Carro resultado = (Carro) instancia.processar("Carro");
        assertEquals(Carro.class, resultado.getClass());

    }
    
    @Test
    public void testeSeProcessadorCriaInstanciaDeBanana() {
        Processador instancia = new Processador();
        Banana resultado = (Banana) instancia.processar("Banana");
        assertEquals(Banana.class, resultado.getClass());

    }

    @Test
    public void testeSeProcessadorCriaInstanciaDeCarroComAtributoVelho() {
        Processador instancia = new Processador();
        Carro resultado = (Carro) instancia.processar("CarroVelho");
        assertTrue(resultado.velho);

    }
    @Test
    public void testeSeProcessadorCriaInstanciaDeBassaComAtributoAmassada() {
        Processador instancia = new Processador();
        Banana resultado = (Banana) instancia.processar("BananaAmassada");
        assertTrue(resultado.amassada);

    }
    
    @Test(expected=ProcessadorInstanciaException.class)
    public void testeSeProcessadorGeraExessaoNaInstanciaDeCarro() {
        Processador instancia = new Processador();
        Carro resultado = (Carro) instancia.processar("new Carro();");
    }
    
    @Test
    public void testeSeProcessadorDevolveApropriaString() {
        Processador instancia = new Processador();
        String resultado = (String) instancia.processar("abc");
        assertEquals("abc", resultado);
    }
    @Test
    public void testeSeProcessadorDevolveInt() {
        Processador instancia = new Processador();
        int resultado = (int) instancia.processar("123");
        assertEquals(123, resultado);
    }
  
}