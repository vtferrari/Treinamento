package mapper;

class CharParaInt implements Mapper<Character, Integer> {

    @Override
    public Integer map(Character mapa) {
        return (int) mapa;
    }
}
