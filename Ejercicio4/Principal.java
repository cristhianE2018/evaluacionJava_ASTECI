package Ejercicio4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        InterfazEjericio iejecicio;
       

        iejecicio = (int edad)->{
            System.out.println("Ingresa edad: ");
            edad = Integer.parseInt(scn.nextLine());
            System.out.println("Ingresa tu nombre: ");
            String name = scn.nextLine();
            double dias = edad * 365;
            double meses = edad * 12;
            double horas = dias * 24;

            System.out.println("Hola " + name +" has vidido dias: " + dias + " meses: " 
            + meses + " horas: " + horas);

        };
        iejecicio.calcularTiempoVivido(25);
        iejecicio.pedirNombre();
    }
}
