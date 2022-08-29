package Ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class OperacionListas {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<Integer>(Arrays.asList(
            1,8,5,2,33,54,22,6,88,13));
       
        listaNumeros.stream().filter(n->n%2==0).forEach(s->System.out.println(s));
        
    }
}
