package mapper;


class IntParaString implements Mapper<Integer, String> {


    @Override
    public String map(Integer mapa) {
        return String.valueOf(mapa);
    }

}
