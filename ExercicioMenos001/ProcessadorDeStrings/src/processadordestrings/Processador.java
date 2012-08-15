package processadordestrings;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import java.util.logging.Level;
import java.util.logging.Logger;

class Processador {

    public Object processar(String processa) {
        SimpleFactoryOperacao operacao = new SimpleFactoryOperacao();
        Operador o = operacao.intanciaDa(processa);
        
        if (o == null) {
            return instanciadorString(processa);
        }
        
        if (processa.matches("[a-zA-Z]*([\\ \\*]|[\\ \\+]).*")) {
            return o.processaString(processa);
        }
        return o.processaInt(processa);
    }

    private Object instanciadorString(String processa) {
        if (processa.matches("[a-z]*")) {
            return processa;
        }
        if (processa.matches("[0-9]*")) {
            return Integer.parseInt(processa);
        }
        if (processa.contains("new")) {
            throw new ProcessadorInstanciaException("Isso aqui não é Java");
        }
        if (processa.equals("Carro")) {
            return new Carro();
        }
        if (processa.equals("CarroVelho")) {
            Carro c = new Carro();
            c.velho = true;
            return c;
        }
        if (processa.equals("BananaAmassada")) {
            Banana b = new Banana();
            b.amassada = true;
            return b;
        }

        return new Banana();

    }
}
