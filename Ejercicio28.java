/*
 *Realiza un programa que sea capaz de recolocar los números de un array de
fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
del array. A continuación generará un array con ese tamaño con números
enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
irá colocando desde fuera hacia adentro los números de tal forma que el
primero se coloca en la primera posición, el segundo en la última, el tercero
en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
el array resultado.
*
Ejemplo 1:
Introduzca el tamaño del array: 12
Array original:
Índice 0 1 2 3 4 5 6 7 8 9 10 11
Valor 120 148 40 108 188 94 60 65 152 27 121 79
Array resultado:
Índice 0 1 2 3 4 5 6 7 8 9 10 11
Valor 120 40 188 60 152 121 79 27 65 94 108 148
*
Ejemplo 2:
Introduzca el tamaño del array: 7
Array original:
Índice 0 1 2 3 4 5 6
Valor 130 36 93 188 20 126 36
Array resultado:
Índice 0 1 2 3 4 5 6
Valor 130 93 20 36 126 188 36
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el tamaño del array: ");
        int arLength=sc.nextInt();
        while(arLength<0){
            System.out.print("La longitud del array no puede ser negativa, por favor, \n vuelva a ingresar el tamaño del array ");
            arLength=sc.nextInt();
        }
        System.out.println("Array original:");
        System.out.print("Índice ");
        for (int i=0; i<arLength;i++){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.print("Valor ");
        for (int i=0;i<arLength;i++){
            System.out.print(((int)(Math.random()*201))+" ");
        }
        sc.close();
    }
}
