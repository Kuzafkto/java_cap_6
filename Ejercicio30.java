/*
 *El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
una cuestión de física elemental, ninguno de los animales puede coincidir
en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
que como mínimo serán de 4 unidades.
*
Ejemplo:
*
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
*   @     & *
*     $     *
* * * * * * *

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int heigth=sc.nextInt();
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int length=sc.nextInt();
        int pos=1;
        while(heigth<4 || length<4){
            if(length<4){
                System.out.print("La anchura de la pecera debe ser mayor a 4, por favor, vuelva a ingresarla: ");
                length=sc.nextInt();
            }
            if(heigth<4){
                System.out.print("La altura de la pesera debe ser mayor a 4, por favor, vuelva a ingresarla: ");
                heigth=sc.nextInt();
            }
        }
        int horse=1+((int)(Math.random()*(heigth-1)))*((int)(Math.random()*(length-1)));
        int seashell=1+((int)(Math.random()*(heigth-1)))*((int)(Math.random()*(length-1)));
        int fish=1+((int)(Math.random()*(heigth-1)))*((int)(Math.random()*(length-1)));

        while(horse==seashell||seashell==fish||fish==horse){
            if(horse==seashell){
                horse=1+((int)(Math.random()*(heigth-1)))*((int)(Math.random()*(length-1)));
            }
            if (seashell==fish){
                seashell=1+((int)(Math.random()*(heigth-1)))*((int)(Math.random()*(length-1)));
            }

            if (fish==horse){
                horse=1+((int)(Math.random()*(heigth-1)))*((int)(Math.random()*(length-1)));
            }
        }

        for (int i=0;i<length; i++){
            System.out.print("*");
        }
        System.out.println("");

        for (int i=1; i<=heigth-2; i++){
            System.out.print("*");
            for (int x=1; x<=length-2; x++){
                if (pos==fish){
                    System.out.print("&");
                    pos++;
                }else if (pos==horse){
                    System.out.print("$");
                    pos++;
                }else if (pos==seashell){
                    System.out.print("@");
                    pos++;
                }else {
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
