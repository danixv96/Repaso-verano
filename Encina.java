public class Encina extends Arbol {


    boolean sagrado;

    public Encina(double altura, double radio, boolean sagrado) {
        super(altura, radio);
        this.sagrado = sagrado;
    }

    public boolean isSagrado() {
        return sagrado;
    }

    public void setSagrado(boolean sagrado) {
        this.sagrado = sagrado;
    }

    @Override
    public String toString() {
        return "Encina{" +
                "sagrado=" + sagrado +
                ", altura=" + altura +
                ", radio=" + radio +
                '}';
    }
}
