package processadordestrings;

public class Instanciador {

    public Object instanciadorString(String processa) {
        if (processa.contains("new")) {
            throw new ProcessadorInstanciaException("Isso aqui não é Java");
        }
        if (processa.contains("Banana")) {
            return trataInstanciaDeBanana(processa);
        }
        return trataInstanciaDeCarro(processa);

    }

    public Carro trataInstanciaDeCarro(String processa) {
        if (processa.equals("CarroVelho")) {
            Carro c = new Carro();
            c.velho = true;
            return c;
        }
        return new Carro();
    }
    public Banana trataInstanciaDeBanana(String processa){
        if (processa.equals("BananaAmassada")) {
            Banana b = new Banana();
            b.amassada = true;
            return b;
        }
        return new Banana();
    }
}
