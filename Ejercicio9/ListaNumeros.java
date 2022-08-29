package Ejercicio9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {
        List<Integer> listaA = new ArrayList<Integer>(Arrays.asList(1,2,4,6,8,0,3,44,52,43,129));
        List<Integer> listaB = new ArrayList<Integer>(Arrays.asList(23,4,6,2,34,7,99,52,5,8));
        List<Integer> coincidencia = new ArrayList<Integer>();

        for (int i = 0; i <= listaA.size()-1; i++) {

            for (int j = 0; j <= listaB.size()-1; j++) {

                if(listaA.get(i) == listaB.get(j)){
                    coincidencia.add(listaA.get(i));
                }

            }
            
        }
        System.out.println("Lista C: ");
        coincidencia.stream().forEach(numero->System.out.print(numero + ", "));

    }
}
