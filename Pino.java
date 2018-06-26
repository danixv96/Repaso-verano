public class Pino extends Arbol {


    String TipoHoja;

    public Pino(double altura, double radio, String tipoHoja) {
        super(altura, radio);
        TipoHoja = tipoHoja;
    }

    public String getTipoHoja() {
        return TipoHoja;
    }

    public void setTipoHoja(String tipoHoja) {
        TipoHoja = tipoHoja;
    }

    @Override
    public String toString() {
        return "Pino{" +
                "TipoHoja='" + TipoHoja + '\'' +
                ", altura=" + altura +
                ", radio=" + radio +
                '}';
    }
}
