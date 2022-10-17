/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
*/
package principal;

import entidad.Array;

public class Principal {

    public static void main(String[] args) {
        
        int[] arr1 = new int[5];
        
        Array arr = new Array(arr1);
        
        try {
            arr1[0] = 1;
            arr1[1] = 1;
            arr1[2] = 1;
            arr1[3] = 1;
            arr1[4] = 1;
            arr1[5] = 1;
            arr1[6] = 1;
            arr1[7] = 1;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No se puede agregar mas de lo que el array tiene para almacenar");
        }
    }
    
}
