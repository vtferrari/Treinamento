package processadordestrings;

class Processador {

    public Object processar(String processa) {
        String rexLetraNumero = "[a-zA-Z\"!@#$%¨&\\*()_\\+]*([\\ \\*]|[\\ \\+]).*";
        String rexNumeroLetra = "[1-9]*([\\ \\*]|[\\ \\+])[a-zA-Z\"!@#$%¨&\\*()_\\+]*";
        
        SimpleFactoryOperacao operacao = new SimpleFactoryOperacao(); 
        Operador o = operacao.intanciaDa(processa);
        
        if (processa.matches(rexLetraNumero) || processa.matches(rexNumeroLetra)) {
            return o.processaString(processa);
        }
        
        return o.processaInt(processa);
    }
}
