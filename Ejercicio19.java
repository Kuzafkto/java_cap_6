/*
 *Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados.

 *@author KuzaFkto
 */


public class Ejercicio19 {
    public static void main(String[] args) {
        int rand=0;
        int bigEven=-100;
        int tinyOdd=199;
        int total=0;
        for (int i=0; i<50; i++){
            rand=-100+(int)(Math.random()*301);
            System.out.println(rand+" ");
            total+=rand;
            if (rand%2==0){
                if(rand>bigEven){
                    bigEven=rand;
                }
            }else{
                if (rand<tinyOdd){
                    tinyOdd=rand;

                }
            }
        }
       System.out.print("El número par mas grande es el "+ bigEven+ " y el mas pequeño de los impares es el " + tinyOdd + " y la media de todos los números generados es " + total/50);


    }
}
