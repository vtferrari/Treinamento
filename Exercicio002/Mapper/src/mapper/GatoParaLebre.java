
package mapper;

class GatoParaLebre implements Mapper<Gato, Lebre> {

    @Override
    public Lebre map(Gato mapa) {
        Lebre lebre = new Lebre();
        lebre.cor = mapa.cor;
        lebre.nome = mapa.nome;
        lebre.peso = mapa.peso;
        return lebre;
    }

}
