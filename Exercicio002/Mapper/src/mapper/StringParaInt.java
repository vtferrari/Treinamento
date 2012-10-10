package mapper;

class StringParaInt implements Mapper<String, Integer> {

    @Override
    public Integer map(String mapa) {
        return Integer.parseInt(mapa);
    }

}
