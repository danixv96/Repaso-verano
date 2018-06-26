public class Alumno extends Persona {

    String ciclo;
    boolean repetidor;
    int dni;

    public Alumno(String nombre, String apellidos, int edad, String ciclo, boolean repetidor, int dni) {
        super(nombre, apellidos, edad);
        this.ciclo = ciclo;
        this.repetidor = repetidor;
        this.dni = dni;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public boolean isRepetidor() {
        return repetidor;
    }

    public void setRepetidor(boolean repetidor) {
        this.repetidor = repetidor;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "ciclo='" + ciclo + '\'' +
                ", repetidor=" + repetidor +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
