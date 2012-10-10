package processadordestrings;

public class Multiplicar implements Operador {

    @Override
    public int processaInt(String processa) {
        int a = Integer.parseInt(processa.substring(0, processa.indexOf("*")).trim());
        int b = Integer.parseInt(processa.substring(processa.indexOf("*") + 1).trim());
        return a * b;
    }

    @Override
    public String processaString(String processa) {
        String newString = "";
        String a = processa.substring(0, processa.indexOf("*")).trim();
        int b = Integer.parseInt(processa.substring(processa.indexOf("*") + 1).trim());

        for (int i = 0; i < b; i++) {
            newString = newString + a;
        }

        return newString;
    }
}
