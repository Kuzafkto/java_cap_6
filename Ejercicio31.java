/*
 *Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
pierde. Si sale otro número, tiene que seguir tirando.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        boolean playing=true;
        int d=0;
        int d2=0;
        int storeD;
        int money;
        System.out.print("Ingrese la cantidad de dinero que quiere apostar: ");
        do{
            money=sc.nextInt();
            if(money<=0){
                System.out.printf("La cantidad de dinero ingresada debe ser mayor que 0, por favor vuelva a ingresarlo: ");
            }
        }while(money<0);

        while (playing){
            d=(int)(1+(Math.random()*6));
            d2=(int)(1+(Math.random()*6));
            System.out.println("Tiramos los dos dados: "+d+" + "+d2);
            if(d+d2==7||d+d2==11){
                money*=2;
                playing=false;
                System.out.print(d+"+"+d2+"="+(d+d2)+" Has ganado, duplicaste tu dinero y ahora tienes "+money);
            }else if(d+d2==2||d+d2==3||d+d2==12){
                money=0;
                playing=false;
                System.out.print(d+" + "+d2+"="+(d+d2)+"Has perdido, no tienes mas dinero para apostar");
            }else{
                storeD=d+d2;
                System.out.println("Debes sumar "+storeD+" para poder ganar ");
                while(playing){
                    d=(int)(1+(Math.random()*6));
                    d2=(int)(1+(Math.random()*6));
                    System.out.println(d+" + "+d2);
                    if(d+d2==storeD){
                        playing=false;
                        System.out.print("Felicidades, has ganado");
                    }else if (d+d2==7){
                        playing=false;
                        System.out.print("Has sacado 7!, perdiste");
                    }
                }
            }
        }
        sc.close();
    }
}
