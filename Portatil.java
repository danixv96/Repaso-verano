public class Portatil extends Dispositivo {

    String mac;
    boolean tactil;

    public Portatil(String marca, String modelo, double precio, String mac, boolean tactil) {
        super(marca, modelo, precio);
        this.mac = mac;
        this.tactil = tactil;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public boolean isTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    @Override
    public String toString() {
        return "Portatil{" +
                "mac='" + mac + '\'' +
                ", tactil=" + tactil +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
