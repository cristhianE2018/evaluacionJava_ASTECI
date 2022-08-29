package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListaNombres {
    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList<String>();
        listaNombres.add("juan");
        listaNombres.add("pedro");
        listaNombres.add("josé");
        listaNombres.add("maria");
        listaNombres.add("sofia");
        String newName = "";

        for(int i=0; i<=listaNombres.size()-1; i++){
            //Se cambia el caracterer ubicado en la posición 0 a mayuscula
            char newCharacter = Character.toUpperCase(listaNombres.get(i).charAt(0));

            //Se concatena con los demas caracteres exceptuando el del index 0
            newName = newCharacter + listaNombres.get(i).substring
            (1, listaNombres.get(i).length());
            //juan = Juan 
            listaNombres.remove(i);
            listaNombres.add(i,newName);
        }

        for (String nombre: listaNombres){

            System.out.println(nombre);
        }
    }
}
