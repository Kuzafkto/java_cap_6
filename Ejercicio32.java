/*
 *Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
Por cada metro de sendero - representado por una línea - puede que haya un
obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
Ejemplo 1:
Introduzca la longitud del sendero en metros: 7
| *  |
 |  O|
 |   |
|  * |
 |*  |
 | O |
 |   |
Ejemplo 2:
Introduzca la longitud del sendero en metros: 5
 |   |
 |  O|
|   |
| * |
 |*  |
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la longitud del sendero en metros: ");
        int heigth;
        do{
            heigth=sc.nextInt();
            if(heigth<0){
                System.out.print("La longitud del sendero debe ser mayor a 0, por favor, introduzcala de nuevo: ");
            }
        }while(heigth<=0);

        int spaces=4;
        int randPos;
        for(int i=0;i<heigth;i++){
            for(int x=0; x<spaces;x++){
                System.out.print(" ");
            }
            System.out.print("|");
            switch ((int)(1+(Math.random()*2))){
                case 1:
                    for(int z=0; z<4;z++){
                        System.out.print(" ");
                    }
                    break;
                case 2:
                    randPos=(int)(1+(Math.random()*4));
                    for(int y=1;y<=4;y++){
                        if(randPos==y){
                            switch ((int)(1+(Math.random()*2))){
                                case 1:
                                    System.out.print("*");
                                    break;
                                case 2:
                                    System.out.print("0");
                            }
                        }else{
                            System.out.print(" ");
                        }
                    }
            }
            System.out.print("|");
            System.out.println("");
            spaces+=-1+(int)(Math.random()*3);
        }
        sc.close();
    }
}
