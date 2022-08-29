package Ejercicio10;

public class ProductoMatrices {
    public static void main(String[] args) {
        int[][] matriz = {{2,0,1},{3,0,0},{5,1,1}};
        int[][] matriz2 = {{1,0,1},{1,2,1},{1,1,0}};
        int[][] matrizResultado = new int[3][3];
        int suma = 0;
        for (int i = 0; i <=matriz.length-1; i++) {

            for (int j = 0; j <=matriz[i].length-1; j++) {
                
                for (int j2 = 0; j2 <=matriz2.length-1; j2++) {
                    suma = suma + (matriz[i][j2] * matriz2[j2][j]);
                }
                matrizResultado[i][j]= suma;
                suma = 0;
            }
        }

        for (int i = 0; i <= matrizResultado.length-1; i++) {
            
            for (int j = 0; j <= matrizResultado[i].length-1; j++) {
                System.out.print(matrizResultado[i][j] + " ");    
            }
            System.out.println();
        }
    }
}
