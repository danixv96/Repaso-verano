public class Coche extends Vehiculo{

    boolean electrico;
    int puertas;


    public Coche(String matricula, String marca, String modelo, String color, int anio, boolean electrico, int puertas) {
        super(matricula, marca, modelo, color, anio);
        this.electrico = electrico;
        this.puertas = puertas;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "electrico=" + electrico +
                ", puertas=" + puertas +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", anio=" + anio +
                '}';
    }
}
