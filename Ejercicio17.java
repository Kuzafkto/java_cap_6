/*
 *Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
*
* * * * * * *
*           *
*         & *
* * * * * * *
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int heigth= sc.nextInt();
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int length= sc.nextInt();
        int randPos = (1+(int)(Math.random()*(length-1)))*(1+(int)(Math.random()*(heigth-1)));
        int pos=0;//Entre 1 y 4 Haz un número aleatorio entre *altura-2*ancho-2 y una posicion que le das el valor 0 y vas aumentando esa posicion y cuando sea igual que el aleatorio imprime pez sino espacio blanco
        for (int i=0;i<length; i++){
            System.out.print("*");
        }
        System.out.println("");
        for (int i=1; i<=heigth-2; i++){
            System.out.print("*");
            for (int x=1; x<=length-2; x++){
                if (pos==randPos){
                        System.out.print("&");
                        pos++;
                }
                    else {
                        pos++;
                        System.out.print(" ");
                    }

            }
            System.out.print("*");
            System.out.println("");
        }
        for (int i= 0; i<length; i++){
            System.out.print("*");
        }
        sc.close();
    }
}
