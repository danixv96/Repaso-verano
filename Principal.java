import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Principal {

    public static void main(String[] args){

        Pino p1 = new Pino(4.75,1.20,"Seca");
        Encina e1 = new Encina(5.25,1.80,true);
        Roble r1 = new Roble(4.20,0.96,43);

        System.out.println("Informacion del Pino 1");

        System.out.println("Altura: "+p1.getAltura() + " - " + "Radio: "+p1.getRadio() + " - " + "Tipo de hoja: "+p1.getTipoHoja());

        System.out.println("Informacion de la Encina 1");

        System.out.println("Altura: "+e1.getAltura() + " - " +  "Radio: "+e1.getRadio() + " - " + "Arbol sagrado: "+e1.isSagrado());

        System.out.println("Informacion del Roble 1");

        System.out.println("Altura: "+r1.getAltura() + " - " + "Radio: "+r1.getRadio() + " - " + "Cantidad de bellotas: "+r1.getCantBellotas());

    }
}
