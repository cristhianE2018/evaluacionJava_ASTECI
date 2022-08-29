package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> listaPaises = new ArrayList<String>();
        listaPaises.add("Rusia");
        listaPaises.add("Estados Unidos");
        listaPaises.add("Brasil");
        listaPaises.add("Canada");
        listaPaises.add("México");
        
        listaPaises.stream().filter(pais->pais.charAt(pais.length()-1) =='a'
        || pais.charAt(pais.length()-1) =='e'
        || pais.charAt(pais.length()-1) =='i'
        || pais.charAt(pais.length()-1) =='o'
        || pais.charAt(pais.length()-1) =='u'
        ).forEach(pais->System.out.println(pais));

       // listaPaises.stream().forEach(pais->System.out.println(pais));

    }
}
