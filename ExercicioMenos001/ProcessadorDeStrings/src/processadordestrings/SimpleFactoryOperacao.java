package processadordestrings;

class SimpleFactoryOperacao {

    Operador intanciaDa(String processa) {
        if (processa.contains("+")) {
            return new Somar();
        }
        if (processa.contains("-")) {
            return new Subtrair();
        }
        if (processa.contains("*")) {
            return new Multiplicar();
        }
        if (processa.contains("/")) {
            return new Dividir();
        }
        if (processa.contains("^")) {
            return new Exponenciar();
        }
        return null;
    }
}
