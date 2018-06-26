public class Movil extends Dispositivo {

    int imei;
    int numTelefono;
    boolean desbloqueo;

    public Movil(String marca, String modelo, double precio, int imei, int numTelefono, boolean desbloqueo) {
        super(marca, modelo, precio);
        this.imei = imei;
        this.numTelefono = numTelefono;
        this.desbloqueo = desbloqueo;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public boolean isDesbloqueo() {
        return desbloqueo;
    }

    public void setDesbloqueo(boolean desbloqueo) {
        this.desbloqueo = desbloqueo;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "imei=" + imei +
                ", numTelefono=" + numTelefono +
                ", desbloqueo=" + desbloqueo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
