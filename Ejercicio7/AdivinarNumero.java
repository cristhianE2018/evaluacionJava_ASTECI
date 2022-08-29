package Ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {

        Random rnd = new Random();
        int n = (int)Math.floor(Math.random()*100+1);
        System.out.println(n);
        Scanner scan = new Scanner(System.in);
        int intentos = 1;
        int numeroDado;
        while(intentos <=5){
            System.out.println("Ingresa valor: ");
            numeroDado = scan.nextInt();
            if(numeroDado <n){
                System.out.println("El número que ingresaste es menor");
            }
            else if(numeroDado > n){
                System.out.println("El número que ingresaste es mayor");
            }
            if(numeroDado == n){
                System.out.println("¡Acertaste!");
                intentos = 5;
            }
            intentos++;
        }
    }
}
