/*
 * Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
*
Ejemplo:
2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara

 *@author KuzaFkto
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        int value=0;
        int coin1=0;
        int coin2=0;
        int coin3=0;
        int coin4=0;
        int coin5=0;

        while (coin1==0 || coin2==0 || coin3==0|| coin4==0||coin5==0){
            value=(int)(Math.random()*5)+1;
            if(value!=coin1 && value!=coin2 && value!=coin3 && value!=coin4 && value!=coin5){
                if (coin1==0){
                    coin1=value;
                    switch(value){
                        case 1:
                            System.out.print("2 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print( "cara " );
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 2:
                            System.out.print("20 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 3:
                            System.out.print("50 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 4:
                            System.out.print("1 euro -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 5:
                            System.out.print("2 euros -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                    }
                    System.out.println("");

                } else if (coin2==0){
                    coin2=value;
                    switch(value){
                        case 1:
                            System.out.print("2 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print( "cara " );
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 2:
                            System.out.print("20 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 3:
                            System.out.print("50 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 4:
                            System.out.print("1 euro -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 5:
                            System.out.print("2 euros -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                    }
                    System.out.println("");
                } else if (coin3==0){
                    coin3=value;
                    switch(value){
                        case 1:
                            System.out.print("2 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print( "cara " );
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 2:
                            System.out.print("20 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 3:
                            System.out.print("50 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 4:
                            System.out.print("1 euro -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 5:
                            System.out.print("2 euros -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                    }
                    System.out.println("");
                }else if (coin4==0 ){
                    coin4=value;
                    switch(value){
                        case 1:
                            System.out.print("2 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print( "cara " );
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 2:
                            System.out.print("20 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 3:
                            System.out.print("50 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 4:
                            System.out.print("1 euro -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 5:
                            System.out.print("2 euros -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                    }
                    System.out.println("");
                }else if (coin5==0 ){
                    switch(value){
                        case 1:
                            System.out.print("2 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print( "cara " );
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 2:
                            System.out.print("20 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 3:
                            System.out.print("50 céntimos -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 4:
                            System.out.print("1 euro -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                        case 5:
                            System.out.print("2 euros -");
                            if (((int)(Math.random()*2)+1)==1){
                                System.out.print(" cara ");
                            }else{
                                System.out.print(" cruz ");
                            }
                            break;
                    }
                    System.out.println("");
                    coin5=value;
                }
        }

        }


    }
}
