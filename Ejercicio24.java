/*
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
*
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7
*
Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3
*
Ejemplo 3:
Por favor, introduzca un número entero positivo: 406783
0
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long n=sc.nextLong();
        long aux=n;
        int choice=0;
        int counter=0;
        if (n>0){

            while(aux>0){
                counter++;
                aux/=10;
            }
            while (choice==0){
                choice=1+(int)(Math.random()*counter);
            }

            while(n>0){
                if(choice==counter){
                    System.out.println(n%10);
                    n/=10;
                    n=0;
                }else{
                    counter--;
                    n/=10;
                }
            }
        }else{
            System.out.println("El número ingresado debe ser positivo");
        }
        sc.close();
    }
}
