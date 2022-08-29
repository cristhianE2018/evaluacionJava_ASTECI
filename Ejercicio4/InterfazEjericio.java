package Ejercicio4;

import java.util.Scanner;

@FunctionalInterface
public interface InterfazEjericio {

    public void calcularTiempoVivido(int edad);
    
    default void pedirNombre(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa nombre: ");
        String nombre = scn.nextLine();

        for (int i = nombre.length()-1; i >= 0; i--) {
            System.out.print(nombre.charAt(i));
        }

    }
}
