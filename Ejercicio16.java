/*
 *  Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
*
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
*
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
*
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
*
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
*
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
*
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int value=0;
        int fig1=0;
        int fig2=0;
        int fig3=0;

        for (int i=1; i<=3; i++){

            switch ((int)(Math.random()*5+1)){
                case 1:
                    System.out.print("corazón ");
                    value=1;
                    break;
                case 2:
                    System.out.print("diamante ");
                    value=2;
                    break;
                case 3:
                    System.out.print("herradura ");
                    value=3;
                    break;
                case 4:
                    System.out.print("campana ");
                    value=4;
                    break;
                case 5:
                    System.out.print("limon ");
                    value=5;
                    break;
            }
            switch (i){
                case 1:
                    fig1=value;
                    break;
                case 2:
                    fig2=value;
                    break;
                case 3:
                    fig3=value;
                    break;
            }
        }

        System.out.println("");
        if (fig1==fig2&&fig2==fig3){
            System.out.println("“Enhorabuena, ha ganado 10 monedas");
        }else if (fig1==fig2||fig2==fig3){
            System.out.println("Bien, ha recuperado su moneda");
        }else{
            System.out.println("Lo siento, ha perdido");
        }
    }
}
