public class Profesor extends Persona {

    int codProfesor;
    int aignaturas;

    public Profesor(String nombre, String apellidos, int edad, int codProfesor, int aignaturas) {
        super(nombre, apellidos, edad);
        this.codProfesor = codProfesor;
        this.aignaturas = aignaturas;
    }

    public int getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(int codProfesor) {
        this.codProfesor = codProfesor;
    }

    public int getAignaturas() {
        return aignaturas;
    }

    public void setAignaturas(int aignaturas) {
        this.aignaturas = aignaturas;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "codProfesor=" + codProfesor +
                ", aignaturas=" + aignaturas +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
