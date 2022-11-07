/*
 *Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta.
Ejemplo 1:
Introduzca la anchura de la tableta: 6
Introduzca la altura de la tableta: 4
******
*****
******
******
*
* Ejemplo 2:
Introduzca la anchura de la tableta: 7
Introduzca la altura de la tableta: 3
*
*******
*******
******
*
Ejemplo 3:
Introduzca la anchura de la tableta: 5
Introduzca la altura de la tableta: 5
*
** **
*****
*****
*****
*****

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la anchura de la tableta: ");
        int length=sc.nextInt();
        System.out.print("Introduzca la altura de la tableta: ");
        int heigth=sc.nextInt();
        int choice=1+(int)(Math.random()*4);
        int bite=0;
        switch (choice){
            case 1:
                bite=1+(int)(Math.random()*length);
                for (int i=1; i<=heigth; i++){
                    for(int x = 1; x<=length ; x++ ){
                        if(x==bite){
                            System.out.print(" ");
                            bite=-2;
                        }else{
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 2:
                bite=1+(int)(Math.random()*heigth);
                for (int i=1; i<=heigth; i++){
                    for(int x = 1; x<=length ; x++ ){
                        if(i==bite){
                            System.out.print(" ");
                            bite=-2;
                        }else{
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 3:
                bite=1+(int)(Math.random()*length);
                for (int i=1; i<=heigth; i++){
                    for(int x = 1; x<=length ; x++ ){
                        if(i==heigth&&x==bite){
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 4:
                bite=1+(int)(Math.random()*heigth);
                for (int i=1; i<=heigth; i++){
                    for(int x = 1; x<=length ; x++ ){
                        if(i==bite && x==length){
                            System.out.print(" ");
                            bite=-2;
                        }else{
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
        }
        sc.close();
    }
}
