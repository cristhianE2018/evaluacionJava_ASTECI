package Ejercicio3;

import java.util.Scanner;

public class ImpresionFigura {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 1;
        System.out.println("Ingresa el valor de n: ");
        n = scn.nextInt();
        int aux = 1; //Para mostrar el elemento en la pirámide
        for(int i=1; i<=n; i++){
            
            for (int j = 1; j <=i; j++) {
                System.out.print(aux + " ");
                aux++;
            }
            System.out.println();
        }

    }
}
