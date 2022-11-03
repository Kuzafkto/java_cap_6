/*
 *Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
*
 *@author KuzaFkto
 */


public class Ejercicio1 {
    public static void main(String[] args) {
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int dice3=(int)(Math.random()*6+1);

        System.out.printf("%-10s %d \n %-10s %d \n %-10s %d \n %-10s %d ","La tirada del primer dado es un ",dice1," La tirada del segundo dado es un ",dice2," La tirada del tercer dado es ", dice3, " La suma de las tres tiradas es de ", (dice1+dice2+dice3));
    }
}
