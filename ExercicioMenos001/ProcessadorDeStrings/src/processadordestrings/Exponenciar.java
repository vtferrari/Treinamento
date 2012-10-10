package processadordestrings;

class Exponenciar implements Operador {

    @Override
    public int processaInt(String processa) {
        int a = Integer.parseInt(processa.substring(0, processa.indexOf("^")).trim());
        int b = Integer.parseInt(processa.substring(processa.indexOf("^") + 1).trim());
        return (int)Math.pow((double) a, (double) b);
    }

    @Override
    public String processaString(String processa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
