public class Arbol {

    double altura;
    double radio;


    public Arbol(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "altura=" + altura +
                ", radio=" + radio +
                '}';
    }
}
