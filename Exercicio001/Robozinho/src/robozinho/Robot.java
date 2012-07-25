package robozinho;

class Robot {

    public Robot() {
    }

    public String comando(Componentes comando) {
        return comando.realizaComando();
    }
}
