/*
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*    *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int heigth=sc.nextInt();
        int fill=(int)(Math.random()*(heigth));
        for (int i = 1; i<heigth;i++){
            System.out.print("*");
            if ((heigth-i)<=fill){
                System.out.print("====");
            }else {
            System.out.print("    ");
            }
            System.out.print("*");
            System.out.println("");
        }
        System.out.print("******");

        System.out.printf("\n La cuba tiene una capacidad de %d litros y contiene %d litros de agua",heigth,fill);
        sc.close();
    }
}
