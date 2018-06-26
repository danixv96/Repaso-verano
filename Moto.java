public class Moto extends Vehiculo {

    int cilindrada;
    int numRuedas;

    public Moto(String matricula, String marca, String modelo, String color, int anio, int cilindrada, int numRuedas) {
        super(matricula, marca, modelo, color, anio);
        this.cilindrada = cilindrada;
        this.numRuedas = numRuedas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", numRuedas=" + numRuedas +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", anio=" + anio +
                '}';
    }
}
