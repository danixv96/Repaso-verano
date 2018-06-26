import java.util.Scanner;

public class Matriz {

    public static Scanner sig = new Scanner(System.in);
    public static void main(String[] args){

        int f = 3;
        int c = 3;
        int matriz[][] = new int[f][c];

        System.out.println("Introduce los numeros:");

        for (f = 0; f < matriz.length; f++){
            for (c = 0;  c < matriz.length; c++) {
                matriz[f][c] = sig.nextInt();
            }
        }

        System.out.println("Matriz completa:");

        for (f = 0; f < matriz.length; f++){
            for (c = 0;  c < matriz.length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }

        }
}
