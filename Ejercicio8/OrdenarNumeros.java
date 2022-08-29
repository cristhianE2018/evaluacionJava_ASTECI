package Ejercicio8;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresa a: ");
        a = scn.nextInt();
        System.out.println("Ingresa b: ");
        b = scn.nextInt();
        System.out.println("Ingresa c: ");
        c = scn.nextInt();

        //Aqui se declara empate
        if(a==b && c==a && b==c){
            System.out.println("Empate!");
        }

        //La condición empieza identificando el mayor de los 3
        if(a>b && a>c){
            //Si se cumple, ahora se ordenan los posibles lugares de los restantes
            if(b>c){
                System.out.println(a + ", " + b + ", " + c);
            }
            else{
                System.out.println(a + ", " + c + ", " + b);
            }
        }

        if(b>a && b>c){
            if(c>a){
                System.out.println(b + ", " + c + ", " + a);
            }
            else{
                System.out.println(b + ", " + a + ", " + c);
            }
        }

        if(c>a && c>b){
            if(b>a){
                System.out.println(c + ", " + b + ", " + a);
            }
            else{
                System.out.println(c + ", " + a + ", " + b);
            }
        }
    }
}
