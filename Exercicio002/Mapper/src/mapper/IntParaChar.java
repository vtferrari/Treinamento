
package mapper;


class IntParaChar implements Mapper<Integer, Character> {

    @Override
    public Character map(Integer mapa) {
        return (char)(int)mapa;
    }


}
