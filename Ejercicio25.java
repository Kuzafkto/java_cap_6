/*
 * Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gen=0;
        boolean prime =true;
        for (int i =0; i<100; i++){
            gen=10+(int)(Math.random()*201);
            if (gen%5==0){
                System.out.print("[" + gen + "] ");
            }else if (gen%2==0){
                System.out.print(gen+" ");
            }else{
                for (int x=3; x<gen/2 && prime==true;x++){
                    if (gen%x==0){
                        System.out.print(gen+" ");
                        prime=false;
                    }
                }
                if (prime){
                    System.out.print("#" + gen + "# ");
                }
                }
            prime=true;
        }
        sc.close();
    }
}
