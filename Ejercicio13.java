/*
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.

 *
 *@author KuzaFkto
 */

import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int dice=1;
        int dice2=3;

        while (dice!=dice2){
            dice=(int)(Math.random()*6)+1;
            dice2=(int)(Math.random()*6)+1;
            System.out.println(dice+ " y " + dice2);
        }
        System.out.println(dice + " y " + dice2);
    }
}
