public class Roble extends Arbol {

    int CantBellotas;

    public Roble(double altura, double radio, int cantBellotas) {
        super(altura, radio);
        CantBellotas = cantBellotas;
    }

    public int getCantBellotas() {
        return CantBellotas;
    }

    public void setCantBellotas(int cantBellotas) {
        CantBellotas = cantBellotas;
    }

    @Override
    public String toString() {
        return "Roble{" +
                "CantBellotas=" + CantBellotas +
                ", altura=" + altura +
                ", radio=" + radio +
                '}';
    }
}
