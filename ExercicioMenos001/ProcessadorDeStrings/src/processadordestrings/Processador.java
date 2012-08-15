package processadordestrings;

class Processador {

    public Object processar(String processa) {
        SimpleFactoryOperacao operacao = new SimpleFactoryOperacao();
        Operador o = operacao.intanciaDa(processa);
        if (processa.matches("[a-z]*")) {
            return processa;
        }
        if (processa.matches("[0-9]*")) {
            return Integer.parseInt(processa);
        }
        if (o == null) {
            Instanciador i = new Instanciador();
            return i.instanciadorString(processa);
        }

        if (processa.matches("[a-zA-Z]*([\\ \\*]|[\\ \\+]).*")) {
            return o.processaString(processa);
        }
        return o.processaInt(processa);
    }
}
